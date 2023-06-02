package com.ApplicationLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Facebook_Launch {

	public static void main(String[] args) {
		
	WebDriver driver;	//WebDriver - it's an object which points towards the current Browser
	System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
	
	 driver=new ChromeDriver();
	 
	driver.navigate().to("http://facebook.com");
	driver.navigate().to("http://google.com");
	driver.close();//it is used to close the Browser-when it has a single tab
	driver.quit();//it is used to close the browser opened with multiple tabs

	}

}
