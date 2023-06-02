package com.GetTittle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignIn_TextGoogleHP {
	
	WebDriver driver;
	String applicationURLAddress="http://google.com";
	
	@BeforeTest
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeBrowser/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationURLAddress);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
		driver.quit();
		
	}
	
	@Test
	public void signInTextTest()
	{
		
		By signInLocater=By.partialLinkText("Sign in");
		WebElement signIn=driver.findElement(signInLocater);
		String signInText=signIn.getText();
		System.out.println(" The Google Home Page SignIn Text is:- "+signInText);
		
		signIn.click();

		
	}
	
	

}
