package com.TestCases;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class OrangeHRMLoginTest {

	WebDriver driver;
	String applicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationURLAddress);	
		
	}
	
	@AfterTest
	public void tearDown()
	{
		
		driver.quit();
	}
	
	@Test(priority=1)
	public void orangeHRM_ExcelFile() throws IOException
	{
		
		FileInputStream fileInput = new FileInputStream("./src/com/ExcelFiles/LogInTest.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fileInput);
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
		Row newRow=testDataSheet.createRow(1);
		
		String expected_LogInPanelText="LOGIN Panel";
		System.out.println(" The expected OrangeHRM Login Panel is:- "+expected_LogInPanelText);
		
		Cell newRowOfCell=newRow.createCell(0);
		newRowOfCell.setCellValue(expected_LogInPanelText);
		
		
		//<div id="logInPanelHeading">LOGIN Panel</div>
		By loginPanelLocator=By.id("logInPanelHeading");
		WebElement loginPanel=driver.findElement(loginPanelLocator);
		String actual_LogInPanelText=loginPanel.getText();
		
		Cell newRowOfCells=newRow.createCell(1);
		newRowOfCells.setCellValue(actual_LogInPanelText);
		
		System.out.println(" The Actual OrangeHRM Login Panel is:- "+actual_LogInPanelText);
		
		if(actual_LogInPanelText.equals(expected_LogInPanelText))
		{
			System.out.println("PASS");
			
			Cell newRowOfCells1=newRow.createCell(2);
			newRowOfCells1.setCellValue("PASS");
			
		}
		else
		{
			System.out.println("FAIL");
			
			Cell newRowOfCells1=newRow.createCell(2);
			newRowOfCells1.setCellValue("PASS");
			
		}
		
		
		// OrangeHRM Tittle Functionality 
		
		String expected_LogInPageTittle="OrangeHRM";
		System.out.println(" The Expected OrangeHRM Tittle is:- "+expected_LogInPageTittle);
		
		Cell newRowOfCells2=newRow.createCell(3);
		newRowOfCells2.setCellValue(expected_LogInPageTittle);
		
		String actual_LogInPageTittle=driver.getTitle();
		System.out.println("The Actual OrangeHRM Tittle is:- "+actual_LogInPageTittle );
		
		Cell newRowOfCells3=newRow.createCell(4);
		newRowOfCells3.setCellValue(actual_LogInPageTittle);
		
		if(actual_LogInPageTittle.contains(expected_LogInPageTittle))
		{
			System.out.println("PASS");
			Cell newRowOfCells4=newRow.createCell(5);
			newRowOfCells4.setCellValue("PASS");
			
		}
		else
		{
			System.out.println("FAIL");
			Cell newRowOfCells4=newRow.createCell(5);
			newRowOfCells4.setCellValue("PASS");
			
			
		}
		
		// OrangeHRM URL Address Functionality 
		
		String expected_LogInPageURLAddress="orangehrm-4.2.0.1";
		System.out.println(" The Expected OtangeHRM URL Address is:- "+expected_LogInPageURLAddress);
		
		Cell newRowOfCells5=newRow.createCell(6);
		newRowOfCells5.setCellValue(expected_LogInPageURLAddress);
		
		String actual_LogInPageURLAddress=driver.getCurrentUrl();
		System.out.println("The Actual OtangeHRM URL Address is:- "+actual_LogInPageURLAddress);
		
		Cell newRowOfCells6=newRow.createCell(7);
		newRowOfCells6.setCellValue(actual_LogInPageURLAddress);
		
		if(actual_LogInPageURLAddress.contains(expected_LogInPageURLAddress))
		{
			System.out.println("PASS");
			Cell newRowOfCells7=newRow.createCell(8);
			newRowOfCells7.setCellValue("PASS");

		}
		else
		{
			System.out.println("FAIL");
			Cell newRowOfCells7=newRow.createCell(8);
			newRowOfCells7.setCellValue("FAIL");
			
		}
		
		//User Name Functionality
		
		String userNameTestData="javeed";
		
		//<input name="txtUsername" id="txtUsername" type="text">
		
		By userNameLocator=By.id("txtUsername");
		WebElement userName=driver.findElement(userNameLocator);
		userName.sendKeys(userNameTestData);
		
		Cell newRowOfCells8=newRow.createCell(9);
		newRowOfCells8.setCellValue(userNameTestData);
		
		// Password Functionality
		
		String passwordTestData="Asijavee@123";
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		By passwordLocator=By.id("txtPassword");
		WebElement password=driver.findElement(passwordLocator);
		password.sendKeys(passwordTestData);
		
		Cell newRowOfCells9=newRow.createCell(10);
		newRowOfCells9.setCellValue(passwordTestData);
		
		//LogIn Functionality
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		By LogInButtonLocater=By.id("btnLogin");
		WebElement LogInButton=driver.findElement(LogInButtonLocater);
		LogInButton.click();
		
		//Home Page Text Functionality
		
		String expected_HomePageText="Admin";
		System.out.println(" The Expected OrangeHRM Home Page Text is:- "+expected_HomePageText);
		
		Cell newRowOfCells10 = newRow.createCell(11);
		newRowOfCells10.setCellValue(expected_HomePageText);
		
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		
		By welcomeAdminLocator=By.id("welcome");
		WebElement welcomeAdmin=driver.findElement(welcomeAdminLocator);
		String actual_HomePageText=welcomeAdmin.getText();
		System.out.println(" The Expected OrangeHRM Home Page Text is:- "+actual_HomePageText);
		
		Cell newRowOfCells11=newRow.createCell(12);
		newRowOfCells11.setCellValue(actual_HomePageText);
		
		if(actual_HomePageText.contains(expected_HomePageText))
		{
			System.out.println("PASS");
			Cell newRowOfCells12=newRow.createCell(13);
		    newRowOfCells12.setCellValue("PASS");
			
		}
		else
		{
			
			System.out.println("FAIL");
			Cell newRowOfCells12=newRow.createCell(13);
		    newRowOfCells12.setCellValue("FAIL");			
			
		}
		
		
		FileOutputStream fileOutput = new FileOutputStream("./src/com/ExcelFiles/LogInTest.xlsx");
		workBook.write(fileOutput);
		
	}
	
	
	
}
