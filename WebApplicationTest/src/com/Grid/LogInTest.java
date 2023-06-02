package com.Grid;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogInTest {
	
	@Parameters("Browser")
	
	@Test
	public void logInTest(String browserName) throws MalformedURLException
	{
		System.out.println(" The name odf the Browser is:- "+browserName); 
		
		DesiredCapabilities cap=null;
			
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			
		
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.100.8:4444/"), cap);
		
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
		
		
		driver.close();
		
		
	}

}
