package com.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_URLAddress {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		String expected_URLAddress="orangehrm-4.2.0.1";
		System.out.println(" The Expected OrangeHRM URL Address is:- "+expected_URLAddress);
		
		String actual_URLAddress=driver.getCurrentUrl();
		System.out.println(" The Actual OrangeHRM URL Address is:- "+actual_URLAddress);
		
		if(actual_URLAddress.contains(expected_URLAddress))
		{
			System.out.println(" The URL Address of OHRM Application is Matched - PASS");
		}
		else
		{
			System.out.println(" The URL Address of OHRM Application is NOT Matched - FAIL");
			
		}
		
		driver.close();
		
	

	}

}
