package com.ApplicationLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonWishlist {

	WebDriver driver;
	String applicationURLAddress="http://www.amazon.in";
	
	@BeforeTest
	public void setUp()
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
	
	@Test(priority=1)
	public void helloSignInMouseOverActionTest()
	{
		
		//id="nav-link-accountList"
		
		By helloSignInLocator=By.id("nav-link-accountList");
		WebElement helloSignIn=driver.findElement(helloSignInLocator);
		
        Actions helloSignInActions=new Actions(driver);
        helloSignInActions.moveToElement(helloSignIn).build().perform();
		
		
	}
	
	@Test(priority=2)
	public void yourWishListTest()
	{
		
		By yourWishListLocator=By.partialLinkText("Your Wish List");
		WebElement yourWishList=driver.findElement(yourWishListLocator);
		yourWishList.click();
		
		
	}
	
	
}
