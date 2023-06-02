package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class BaseTest {
	
	public static WebDriver driver;
	String applictionUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","./chromeBrowser/chromedriver.exe");
		
		Log.info("****** successfully Navigate to the Chrome ***");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get(applictionUrlAddress);
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
