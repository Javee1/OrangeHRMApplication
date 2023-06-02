package com.GetTittle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePage_Tittle {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
		  driver=new ChromeDriver();
		  
		  driver.navigate().to("http://google.com");
		  String googleGetTittle=driver.getTitle();
		  System.out.println(" The tittle of Google Home Page is:- "+googleGetTittle);
		  driver.close();
	}

}
