package code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverInstance {

	public WebDriver _driver;
	
	public WebDriver getDriverInstance(String browserName)
	{
		switch(browserName)
		{
		case "Firefox":
			_driver = new FirefoxDriver();
			break;

		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "Utility/chromedriver.exe");
			_driver = new ChromeDriver();
			break;

		case "InternetExplorer":
			System.setProperty("webdriver.ie.driver", "Utility/iedriver.exe");
			_driver = new InternetExplorerDriver();
			break;
		}
		_driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		_driver.manage().window().maximize();
		return _driver;
	}
	
}
