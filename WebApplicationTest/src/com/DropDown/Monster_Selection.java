package com.DropDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monster_Selection {
	
	WebDriver driver;
	String applicationURLAddress="https://my.monsterindia.com/sponsered-poup.html/";
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeBrowser/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(applicationURLAddress);
		
	}
	
	public void tearDown()
	{
		driver.quit();
		
	}
	
	public static void main(String[] args) {
		
		Monster_Selection obj = new Monster_Selection();
		obj.setUp();
		
	}

}
