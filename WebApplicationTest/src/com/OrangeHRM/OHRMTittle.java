package com.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMTittle {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		String expected_OrangeHRMTittle="OrangeHRM";
		System.out.println(" The Expected tittle of the Orange HRM page is:- "+expected_OrangeHRMTittle);
		
		String actual_OrangeHRMTittle=driver.getTitle();
		System.out.println(" The Actual tittle of the Orange HRM page is:- "+actual_OrangeHRMTittle);
		
		if(actual_OrangeHRMTittle.equals(expected_OrangeHRMTittle))
		{
			System.out.println(" Tittle of Orange HRM page is Matched :- Pass");
		}
		else
		{
			System.out.println(" Tittle of Orange HRM page is Not Matched :- Fail");
		}
		
		driver.quit();

	}

}
