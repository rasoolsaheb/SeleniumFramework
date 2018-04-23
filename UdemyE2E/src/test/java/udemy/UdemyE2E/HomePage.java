package udemy.UdemyE2E;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.LandingPage;
import Resources.Base;

public class HomePage extends Base{
	@Test
	public void BaseNaviagation() throws IOException
	{
		driver=IntializeDriver();
		driver.get("https://facebook.com");
	    LandingPage lp=new LandingPage(driver);
	    lp.userName().sendKeys("rasool.saheb@gmail.com");
	    lp.passWord().sendKeys("p56kalandar");
	    lp.login().click();
	}

}
