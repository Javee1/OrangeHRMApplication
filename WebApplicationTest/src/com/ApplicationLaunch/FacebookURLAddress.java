package com.ApplicationLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookURLAddress {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		String actual_facebookURLAddress=driver.getCurrentUrl();
        System.out.println(" The actual facebook Login page URL address is:- "+actual_facebookURLAddress);
        
        String expected_facebookURLAddress="facebook.com";
        System.out.println(" The actual facebook Login page URL address is:- "+expected_facebookURLAddress);
        
        if(actual_facebookURLAddress.contains(expected_facebookURLAddress))
        {
        	System.out.println(" facebook Application URL address Matched - PASS");
        }
        else
        {
        	System.out.println(" facebook Application URL address NOT Matched - FAIL");
        }
        
        driver.quit();


	}

}
