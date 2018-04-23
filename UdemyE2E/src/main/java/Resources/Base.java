package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public WebDriver driver;

	public WebDriver IntializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\AAHIL_SHAZAAD\\workspace\\UdemyE2E\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
		else if (browsername.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver","C:\\SeleniumDrivers\\geckodriver.exe");
			 driver=new FirefoxDriver();
			
		}
		else if (browsername.equals("IE"))
		{
			System.setProperty("webdriver.IE.driver","C:\\SeleniumDrivers\\MicrosoftWebDriver.exe");
			 driver=new InternetExplorerDriver();
		}
		
	   driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	   return driver;
	}
}
