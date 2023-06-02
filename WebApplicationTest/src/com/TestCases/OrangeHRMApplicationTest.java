package com.TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMApplicationTest {
	
	WebDriver driver;
	String applicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	FileInputStream propertiesFile;
	Properties properties;
	
	
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeBrowser/chromedriver.exe");
		driver=new ChromeDriver();
			
		driver.get(applicationURLAddress);
	}
	/*
	@AfterTest
	public void tearDown()
	{
		
		driver.quit();
	}
	*/
	@Test(priority=1)
	public void validatingOrangeHRMApplicationLogInPageTest() throws IOException
	{
		propertiesFile=new FileInputStream("./src/com/Config/OrangeHRMApplication.properties");
		properties=new Properties();
		properties.load(propertiesFile);
		
		//Validating OrangeHRM Application Login Page Text
		
		String expected_OrangeHRMApplicationLogInPageTittle="OrangeHRM";
		System.out.println(" The Expected Orange HRM Application Page tITTLE is:- "+expected_OrangeHRMApplicationLogInPageTittle);
		
		String actual_OrangeHRMApplicationLogInPageTittle=driver.getTitle();		
		System.out.println(" The Actual Orange HRM Application Page Tittle is:- "+actual_OrangeHRMApplicationLogInPageTittle);
		
		if(actual_OrangeHRMApplicationLogInPageTittle.equals(expected_OrangeHRMApplicationLogInPageTittle))
		{
			System.out.println(" Title of OrangeHRM Application LogIn Page Matched - PASS ");
		}
		else
		{
			System.out.println(" Title of OrangeHRM Application LogIn Page is NOT Matched - FAIL ");
			
		}
		
		//Validating OrangeHRM Application URL Address
		
		String expected_OrangeHRMApplicationURLAddress="orangehrm-4.2.0.1";
		System.out.println(" The Expected Orange HRM Application URL Address is:- "+expected_OrangeHRMApplicationLogInPageTittle);
		
		String actual_OrangeHRMApplicationURLAddress=driver.getCurrentUrl();
		System.out.println(" The Actual Orange HRM Application URL Address is:- "+actual_OrangeHRMApplicationURLAddress);
		
		if(actual_OrangeHRMApplicationURLAddress.contains(expected_OrangeHRMApplicationURLAddress))
		{
			System.out.println("  URL Address of OrangeHRM Application found with the expected text - PASS ");
		}
		else
		{
			System.out.println("  URL Address of OrangeHRM Application is NOT found with the expected text - FAIL ");
			
		}
		
		//Validating OrangeHRM Application LogInPanel Text
		
		String expected_OrangeHRMApplicationLogInPanelText="LOGIN Panel";
		System.out.println(" The Expected Orange HRM Application LogIn Panel Text is:- "+expected_OrangeHRMApplicationLogInPanelText);
		
		By logInPanelLocator=By.id(properties.getProperty("orangeHRMApplicationLogInPageLogInPanelProperty"));
		WebElement logInPanel=driver.findElement(logInPanelLocator);
		String actual_OrangeHRMApplicationLogInPanelText=logInPanel.getText();
		System.out.println(" The Actual Orange HRM Application LogIn Panel Text is:- "+actual_OrangeHRMApplicationLogInPanelText);
		
		if(actual_OrangeHRMApplicationLogInPanelText.equals(expected_OrangeHRMApplicationLogInPanelText))
		{
			System.out.println(" Successfully Navigated to OrangeHRM Application LogIn Page - PASS ");
		}
		else
		{
			System.out.println(" Failed Navigated to OrangeHRM Application LogIn Page - FAIL ");
		}
		
	}
	
	@Test(priority=2)
	public void validatingLogInTest()
	{
		
	//Validating UserName Functionality Of OrangeHRM Application 
		String userNameTestData="javeed";
		
		By userNameLocator=By.id(properties.getProperty("userNameElementProprty"));
		WebElement userName=driver.findElement(userNameLocator);
		userName.sendKeys(userNameTestData);
		
		//Validating Password Functionality of OrangeHRM Application
		String passwordTestData="Asijavee@123";
		
		By passwordLoactor=By.id(properties.getProperty("passwordElementProperty"));
		WebElement password=driver.findElement(passwordLoactor);
		password.sendKeys(passwordTestData);
		
		//Validating LogIn Button Functionality
		
		By logInButtonLocator=By.className(properties.getProperty("logInPageSubmitButtonProperty"));
		WebElement logInButton=driver.findElement(logInButtonLocator);
		logInButton.click();
	}
	
	@Test(priority=3)
	public void validationOrangeHRMApplicationHomePageTest()
	{
		
		//Validating OrangeHRM Application Home Page Text
		
		String expected_OrangeHRMApplicationHomePageText="Admin";
		System.out.println(" The Expected OrangeHRM Application Home Page Text is:- "+expected_OrangeHRMApplicationHomePageText);
		
	    By welcomeAdminLocator=By.partialLinkText(properties.getProperty("welComeAdminProperty"));
	    WebElement welcomeAdmin=driver.findElement(welcomeAdminLocator);
		String actual_OrangeHRMApplicationHomePageText=welcomeAdmin.getText();
		System.out.println(" The Actual OrangeHRM Application Home Page Text is:- "+actual_OrangeHRMApplicationHomePageText);
		
		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
			System.out.println(" Successfully Navigated to OrangeHRM Application HomePage - PASS ");
		}
		else
		{
			System.out.println(" Failed Navigated to OrangeHRM Application HomePage - FAIL ");
		}
		
	}
	
	@Test(priority=4)
	public void validatingPIMTest()
	{
		
		// Validating PIM Functionality
		
		By pimLocator=By.id(properties.getProperty("homePagePIMProperty"));
		WebElement pim=driver.findElement(pimLocator);
		
		Actions pimAction=new Actions(driver);
		pimAction.moveToElement(pim).build().perform();
		
				
	}
	
	@Test(priority=5)
	public void validatingAddEmployeeTest()
	{
		//validating Add Employee Test
		
		By addEmployeeLocator=By.partialLinkText(properties.getProperty("pimAddEmployeeProperty"));
		WebElement addEmployee=driver.findElement(addEmployeeLocator);
		addEmployee.click();
		
		String expected_AddEmployeeText="Add Employee";
		System.out.println(" The Expected Add Employee Text is:- "+expected_AddEmployeeText);
		
		By addEmployeeTextLocator=By.xpath(properties.getProperty("addEmployeeTextProprety"));
		WebElement addEmployeeText=driver.findElement(addEmployeeTextLocator);
		String actual_AddEmployeeText=addEmployeeText.getText();
		System.out.println(" The Actual Add Employee Text is:- "+actual_AddEmployeeText);
		
		if(actual_AddEmployeeText.equals(expected_AddEmployeeText))
		{
			System.out.println(" PASS ");
		}
		else
		{
			System.out.println(" FAIL ");
		}
		
	}

	@Test(priority=6)
	public void addNewEmployeeTest() throws InterruptedException, IOException
	{
		
		//Validating Add Employee - First Name , Middle Name , Last Name
		
		By firstNameLocator=By.id(properties.getProperty("firstNameProperty"));
		WebElement firstName=driver.findElement(firstNameLocator);
		firstName.sendKeys("Shaik");
		
		Actions employeePage=new Actions(driver);
		employeePage.sendKeys(Keys.TAB).build().perform();
		
		employeePage.sendKeys("Cf").build().perform();
		
		employeePage.sendKeys(Keys.TAB).build().perform();
		employeePage.sendKeys("Javeed").build().perform();
		
		employeePage.sendKeys(Keys.TAB).build().perform();
		employeePage.sendKeys(Keys.TAB).build().perform();
		
		employeePage.sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(10000);
		
		java.lang.Runtime.getRuntime().exec("./src/com/Image/liveTechimage.exe");
		
		Thread.sleep(5000);
		
		By saveButtonLocator=By.id(properties.getProperty("saveButtonProperty"));
		WebElement saveButton=driver.findElement(saveButtonLocator);
		saveButton.click();

	}
	
	@Test(priority=7)
	public void logOutTest() throws InterruptedException
	{
		
	    By welcomeAdminLocater=By.partialLinkText(properties.getProperty("welComeAdminProperty"));
	    WebElement welComeAdmin=driver.findElement(welcomeAdminLocater);
		welComeAdmin.click();
		
		// wait - java
		Thread.sleep(10000);
		
		//	<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		By logOutLocator=By.linkText("Logout");
		WebElement logOut=driver.findElement(logOutLocator);
		logOut.click();
		
		
	}
	
}
