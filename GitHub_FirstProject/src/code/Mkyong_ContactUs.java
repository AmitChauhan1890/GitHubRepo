package code;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mkyong_ContactUs extends DriverInstance{

	@BeforeTest
	public void setUpDriver()
	{
		super.getDriverInstance("Firefox");
	}
	
	@AfterTest
	public void closeBrowserInstance()
	{
		_driver.get("http://www.mkyong.com/contact-mkyong/");
	}
	
	@Test
	public void isPageAccessible()
	{
		Assert.assertTrue(_driver.findElement(By.xpath("//h1[text()='Contact Us']")).isDisplayed());
	}
}
