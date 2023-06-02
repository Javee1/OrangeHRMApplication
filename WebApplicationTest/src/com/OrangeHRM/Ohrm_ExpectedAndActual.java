package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ohrm_ExpectedAndActual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

	    
	    //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" 
	    //id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
	    Actions pimAction;
	    By pimLocater=By.id("menu_pim_viewPimModule");
	    WebElement pim=driver.findElement(pimLocater);
	    pimAction=new Actions(driver);
	    pimAction.moveToElement(pim).build().perform();
	    
	    //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee"
	    //id="menu_pim_addEmployee">Add Employee</a>
	    By addEmployeeLocater=By.partialLinkText("Add Employee");
	    WebElement addEmployee=driver.findElement(addEmployeeLocater);
	    addEmployee.click();
	    
	    String expected_FirstName="First Name";
	    System.out.println(" The Expected First Name is:- "+expected_FirstName);
	    
	    String expected_MiddleName="Middle Name";
	    System.out.println(" The Expected First Name is:- "+expected_MiddleName);
	    
	    String expected_LastName="Last Name";
	    System.out.println(" The Expected First Name is:- "+expected_LastName);
	    
	    

	}

}
