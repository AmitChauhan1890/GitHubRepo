package code;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Mkyong_ContactUs extends DriverInstance{

	@BeforeTest
	public void setUpDriver()
	{
		super.getDriverInstance("Chrome");
	}
	
	@AfterTest
	public void closeBrowserInstance()
	{
		_driver.close();
	}
	
	@DataProvider
	Object[][] multipleURLs()
	{
		Object obj1[][]=new Object[10][1];
//		for (int i = 0; i < obj1.length; i++)
//			for(int j=0; j<1;j++)
//			obj1[i][j]="Test"+i+j;
		obj1[0][0]="http://www.mkyong.com/contact-mkyong/";
		obj1[1][0]="https://github.com/contactus";
		obj1[2][0]="http://catalog.monotype.com/";
		
		return obj1;
	}
	
	@Test(dataProvider="multipleURLs")
	public void isPageAccessible(String testURL)
	{
		//
		
		_driver.get(testURL);
		Assert.assertTrue(_driver.findElement(By.xpath("//*[contains(text(),'contact')]")).isDisplayed());
	}
}
