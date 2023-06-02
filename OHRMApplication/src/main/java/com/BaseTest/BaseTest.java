package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class BaseTest {
	
	public WebDriver driver;
	String applictionUrlAddress="http://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","./chromeBrowser/chromedriver.exe");
		
		Log.info("****** successfully Navigate to the Chrome ***");
		
		driver = new ChromeDriver();
		driver.get(applictionUrlAddress);
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
