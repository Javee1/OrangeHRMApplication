package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		//<input name="txtUsername" id="txtUsername" type="text">
		
		//id - locator(attribute)
	
		//selector - txtUsername(value)
		
		//driver.findElement(By.id("txtUsername")).sendKeys("javeed");
		
		//WebElement hello=driver.findElement(By.id("txtUsername"));
		//hello.sendKeys("javeed");
			
		
		String userNameTestData="javeed";
		//identifying the property of the element under test 
		By userNameLocator=By.id("txtUsername");//finding identifying the element on the current webpage
		WebElement userName=driver.findElement(userNameLocator);
		//performing operation on the element under test 
		userName.sendKeys(userNameTestData);
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		String passwordTestData="Asijavee@123";
		By passwordLocator=By.id("txtPassword");
		WebElement password=driver.findElement(passwordLocator);
		password.sendKeys(passwordTestData);
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By logInButtonLocator=By.id("btnLogin");
		WebElement logInButton=driver.findElement(logInButtonLocator);
		logInButton.click();
		
		
		//driver.close();
		
		
			
		
		
		
	}

}
