package com.OrangeHRM;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WelcomAdminAndLogOut {

	public static void main(String[] args) throws InterruptedException {
		
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
	    
	    //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	    By welcomeAdminLocater=By.id("welcome");
	    WebElement welcomeAdmin=driver.findElement(welcomeAdminLocater);
	    welcomeAdmin.click();
	   
	    
	    Thread.sleep(10000);
	    
	    //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	    
	    By logOutLocater=By.partialLinkText("Logout");
	    WebElement logOut=driver.findElement(logOutLocater);
	    logOut.click();
	    
	    

		

	}

}
