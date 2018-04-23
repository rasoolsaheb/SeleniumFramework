package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	By un=By.xpath("//*[@id='email']");
	By pw=By.xpath("//*[@id='pass']");
	By login=By.xpath("//*[@id='u_0_9']");
public LandingPage(WebDriver driver)
{
	this.driver=driver;
}
	
	public WebElement userName()
	{
		return driver.findElement(un);
	}
	public WebElement passWord()
	{
		return driver.findElement(pw);
	}
	
public WebElement login()
{
	return driver.findElement(login);
}

	
}
