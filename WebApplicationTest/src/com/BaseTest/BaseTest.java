package com.BaseTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
	public static void main(String[] args)throws IOException {
		
		BaseTest obj = new BaseTest();
		obj.setUp();
		obj.tearDown();
		
		
	}
	
	

}
