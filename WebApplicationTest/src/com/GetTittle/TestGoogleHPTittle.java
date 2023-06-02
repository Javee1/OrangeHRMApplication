package com.GetTittle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogleHPTittle {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
		
		driver=new ChromeDriver();
	    driver.navigate().to("http://google.com");
	    
	    String expected_GoogleHomePageTittle=driver.getTitle();
	    System.out.println(" The tittle of google home page is:- "+expected_GoogleHomePageTittle);
	    
	    String actual_GoogleHomePageTittle=driver.getTitle();
	    System.out.println(" The tittle of google home page is:- "+actual_GoogleHomePageTittle);
	    
	    if(actual_GoogleHomePageTittle.equals(expected_GoogleHomePageTittle))
	    {
	    	System.out.println(" Google home page tittle Matched - pass");
	    }
	    else
	    {
	    	System.out.println(" Google home page tittle  NOT Matched - Fail");
	    }
	    
	    driver.close();
	    

	}

}

