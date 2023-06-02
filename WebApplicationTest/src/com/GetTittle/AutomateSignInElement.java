package com.GetTittle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomateSignInElement {
	
	WebDriver driver;
	String applicationURLAddress ="http://google.com";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeBrowser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationURLAddress);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		
	}
	
	@Test
	public void signInFunctionality()
	{
		
		//<a class="gb_ma gb_td gb_Xd gb_id" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
		//continue=https://www.google.com/&amp;ec=GAZAmgQ" 
		//target="_top"><span class="gb_Vd">Sign in</span></a>
		
		By signInLocator=By.partialLinkText("Sign in");
		WebElement signIn=driver.findElement(signInLocator);
		signIn.click();
		
	}
	

}
