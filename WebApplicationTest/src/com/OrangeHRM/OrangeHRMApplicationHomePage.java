package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplicationHomePage {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		//<input name="txtUsername" id="txtUsername" type="text">
		String userNameTestData="javeed";
	    By userNameLocater=By.id("txtUsername");
	    WebElement userName=driver.findElement(userNameLocater);
	    userName.sendKeys(userNameTestData);
	    
	    //<input name="txtPassword"  autocomplete="off" type="password">
		String passwordTestData="Asijavee@123";
		By passwordLocater=By.name("txtPassword");
	    WebElement password=driver.findElement(passwordLocater);
	    password.sendKeys(passwordTestData);
	    
	    //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	    By logInButtonLocater=By.id("btnLogin");
	    WebElement logInButton=driver.findElement(logInButtonLocater);
	    logInButton.click();
	    
	    String expectedText="Admin";
	    System.out.println(" The Expected Text of OrangeHRM Home Page is:- "+expectedText);
	    
	    // id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
	    By adminTextLocater=By.id("menu_admin_viewAdminModule");
	    WebElement adminText=driver.findElement(adminTextLocater);
	    String actualText=adminText.getText();
	    System.out.println(" The Actual Text of OrangeHRM Home Page is:- "+actualText);
	    
	    if(actualText.equals(expectedText))
	    {
	    	System.out.println(" The Text of OrangeHRM HP is Matched - PASS");
	    }
	    else
	    {
	    	System.out.println(" The Text of OrangeHRM HP is NOT Matched - FAIL");
	    }
	    
	    driver.close();

	}

}
