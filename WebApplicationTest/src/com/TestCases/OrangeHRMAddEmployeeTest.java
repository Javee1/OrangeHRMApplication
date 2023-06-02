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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMAddEmployeeTest {
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
		
		FileInputStream fileInput = new FileInputStream("./src/com/ExcelFiles/AddEmployeeTest.xlsx");
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
		
		//User Name Functionality
		
		String userNameTestData="javeed";
				
		//<input name="txtUsername" id="txtUsername" type="text">
				
		By userNameLocator=By.id("txtUsername");
		WebElement userName=driver.findElement(userNameLocator);
		userName.sendKeys(userNameTestData);
				
		Cell newRowOfCells5=newRow.createCell(6);
		newRowOfCells5.setCellValue(userNameTestData);
				
		// Password Functionality
				
		String passwordTestData="Asijavee@123";
				
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
				
	    By passwordLocator=By.id("txtPassword");
		WebElement password=driver.findElement(passwordLocator);
		password.sendKeys(passwordTestData);
				
		Cell newRowOfCells6=newRow.createCell(7);
		newRowOfCells6.setCellValue(passwordTestData);
				
		//LogIn Functionality
				
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
				
		By LogInButtonLocater=By.id("btnLogin");
		WebElement LogInButton=driver.findElement(LogInButtonLocater);
		LogInButton.click();
				
		//Home Page Text Functionality
				
		String expected_HomePageText="Welcome Admin";
		System.out.println(" The Expected OrangeHRM Home Page Text is:- "+expected_HomePageText);
				
		Cell newRowOfCells7 = newRow.createCell(8);
		newRowOfCells7.setCellValue(expected_HomePageText);
				
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
				
		By welcomeAdminLocator=By.id("welcome");
		WebElement welcomeAdmin=driver.findElement(welcomeAdminLocator);
	    String actual_HomePageText=welcomeAdmin.getText();
		System.out.println(" The Expected OrangeHRM Home Page Text is:- "+actual_HomePageText);
		
				
		Cell newRowOfCells8=newRow.createCell(9);
		newRowOfCells8.setCellValue(actual_HomePageText);
				
		if(actual_HomePageText.equals(expected_HomePageText))
			{
				System.out.println("PASS");
				Cell newRowOfCells9=newRow.createCell(10);
			    newRowOfCells9.setCellValue("PASS");
					
			}
			else
			{
					
	     		System.out.println("FAIL");
     			Cell newRowOfCells9=newRow.createCell(10);
			    newRowOfCells9.setCellValue("FAIL");			
					
			}
				
		
		// Navigating to PIM
		
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" 
		//id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		
		By pimLocator=By.id("menu_pim_viewPimModule");
		WebElement pim=driver.findElement(pimLocator);
		
		Actions pimActions = new Actions(driver);
		pimActions.moveToElement(pim).build().perform();
		
		//selecting Add Employee Page
		
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee"
		//id="menu_pim_addEmployee">Add Employee</a>
		
		By addEmployeeLocator=By.partialLinkText("Add Employee");
		WebElement addEmployee=driver.findElement(addEmployeeLocator);
		addEmployee.click();
		
		String expected_AddEmployeePageText="Add Employee";
		System.out.println(" The Expected Add Employee Page is:- "+expected_AddEmployeePageText);
		
		Cell newRowOfCells10 = newRow.createCell(11);
		newRowOfCells10.setCellValue(expected_AddEmployeePageText);
		
		///html/body/div[1]/div[3]/div/div[1]/h1
		
		By addEmployeeTextLocator=By.xpath("/html/body/div[1]/div[3]/div/div[1]/h1");
		WebElement addEmployeeText=driver.findElement(addEmployeeTextLocator);		
		String actual_AddEmployeePageText=addEmployeeText.getText();
		System.out.println(" The Expected Add Employee Page is:- "+actual_AddEmployeePageText);
		
		Cell newRowOfCells11=newRow.createCell(12);
		newRowOfCells11.setCellValue(actual_AddEmployeePageText);
		
		
		if(actual_AddEmployeePageText.equals(expected_AddEmployeePageText))
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
		
		
		// validating Add Employee Page - First Name , Middle Name , Last Name 
		
		String fistNameTestData="Shaik";
		
		//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		
		By firstNameLocator=By.id("firstName");
		WebElement firstName=driver.findElement(firstNameLocator);
		firstName.sendKeys(fistNameTestData);
		
		Cell newRowOfCells13=newRow.createCell(14);
		newRowOfCells13.setCellValue(fistNameTestData);
		
		//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
		
		String middleNameTestData="Cf";
		
		By middleNameLocator=By.id("middleName");
		WebElement middleName=driver.findElement(middleNameLocator);
		middleName.sendKeys(middleNameTestData);
		
		Cell newRowOfCells14=newRow.createCell(15);
		newRowOfCells14.setCellValue(middleNameTestData);
		
		// <input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		
		String lastNameTestData="Javeed";
		
		By lastNameLocator=By.id("lastName");
		WebElement lastName=driver.findElement(lastNameLocator);
		lastName.sendKeys(lastNameTestData);
		
		Cell newRowOfCells15=newRow.createCell(16);
		newRowOfCells15.setCellValue(lastNameTestData);
		
		//<input class="formInputText valid" maxlength="10" type="text"
		//name="employeeId" value="0068" id="employeeId">
		
		By employeeIdLocator=By.id("employeeId");
		WebElement employeeId=driver.findElement(employeeIdLocator);
		String employeeIdText=employeeId.getAttribute("value");
		System.out.println(" The Actual Employee ID is:- "+employeeIdText);
		
		Cell newRowOfCells16=newRow.createCell(17);
		newRowOfCells16.setCellValue(employeeIdText);
		
		// Save Button Functionality
		
		//<input type="button" class="" id="btnSave" value="Save">
		
		By saveButtonLocator=By.id("btnSave");
		WebElement saveButton=driver.findElement(saveButtonLocator);
		saveButton.click();
		
		
		// Validating Personal Details Text
		
		String expected_PersonalDetailsPageText="Personal Details";
		System.out.println(" The Expected Personal Details Page Text is:- "+expected_PersonalDetailsPageText);
		
		Cell newRowOfCells17=newRow.createCell(18);
		newRowOfCells17.setCellValue(expected_PersonalDetailsPageText);
		
		
		///html/body/div[1]/div[3]/div/div[2]/div[1]/h1
		
		By personalDetailsTextLocater=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/h1");
		WebElement personalDetailsText=driver.findElement(personalDetailsTextLocater);
		String actual_PersonalDetailsPageText=personalDetailsText.getText();
		System.out.println(" The Actual Personal Details Page Text is:- "+actual_PersonalDetailsPageText);
		
		Cell newRowOfCells18=newRow.createCell(19);
		newRowOfCells18.setCellValue(actual_PersonalDetailsPageText);
		
		if(actual_PersonalDetailsPageText.equals(expected_PersonalDetailsPageText))
		{
			System.out.println("PASS");
			Cell newRowOfCells19=newRow.createCell(20);
			newRowOfCells19.setCellValue("PASS");
			
		}
		else
		{
			System.out.println("FAIL");
			Cell newRowOfCells19=newRow.createCell(20);
			newRowOfCells19.setCellValue("FAIL");
			
			
		}
		
		
		// Validating First Name
		
		///html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[1]/li/ol/li[1]/div
		
		By personalDetails_FirstNameLocator=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[1]/li/ol/li[1]/div");
		WebElement personalDetails_FirstName=driver.findElement(personalDetails_FirstNameLocator);
		String actual_FirstNameText=personalDetails_FirstName.getText();
		System.out.println(" The Actual First Name Text is:- "+actual_FirstNameText);
		
		Cell newRowOfCells20=newRow.createCell(21);
		newRowOfCells20.setCellValue(actual_FirstNameText);
		
		
		//value="Shaik"  id="personal_txtEmpFirstName"
		
		By personalDetails_EmployeeFirstNameLocater=By.id("personal_txtEmpFirstName");
		WebElement personalDetails_EmployeeFirstName=driver.findElement(personalDetails_EmployeeFirstNameLocater);
		String presonalDetails_EmployeeFirstNameText=personalDetails_EmployeeFirstName.getAttribute("value");
		System.out.println(" The Employee First Name Text is:- "+presonalDetails_EmployeeFirstNameText);
		
		Cell newRowOfCells21=newRow.createCell(22);
		newRowOfCells21.setCellValue(presonalDetails_EmployeeFirstNameText);
		
		
		// Validating Middle Name
		
		///html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[1]/li/ol/li[2]/div
		
		By personalDetails_MiddleNameLocator=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[1]/li/ol/li[2]/div");
		WebElement personalDetails_MiddleName=driver.findElement(personalDetails_MiddleNameLocator);
		String actual_MiddleNameText=personalDetails_MiddleName.getText();
		System.out.println(" The Actual Middle Name Text is:- "+actual_MiddleNameText);
		
		Cell newRowOfCells22=newRow.createCell(23);
		newRowOfCells22.setCellValue(actual_MiddleNameText);
		
		//value="Cf"  id="personal_txtEmpMiddleName"
		
		By personalDetails_EmployeeMiddleNameLocator=By.id("personal_txtEmpMiddleName");
		WebElement personalDeatails_EmployeeMiddleName=driver.findElement(personalDetails_EmployeeMiddleNameLocator);
		String personalDetails_EmployeeMiddleNameText=personalDeatails_EmployeeMiddleName.getAttribute("value");
		System.out.println(" The Employee Middle Name Text is:- "+personalDetails_EmployeeMiddleNameText);
		
		Cell newRowOfCells23=newRow.createCell(24);
		newRowOfCells23.setCellValue(personalDetails_EmployeeMiddleNameText);
		
		
		//Validating Last Name 
		
		///html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[1]/li/ol/li[3]/div
		
		By personalDetails_LastNameLocator=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[1]/li/ol/li[3]/div");
		WebElement personalDetails_LastName=driver.findElement(personalDetails_LastNameLocator);
		String actual_LastNameText=personalDetails_LastName.getText();
		System.out.println(" The Actual Last Name Text is:- "+actual_LastNameText);
		
		Cell newRowOfCells24=newRow.createCell(25);
		newRowOfCells24.setCellValue(actual_LastNameText);
		
		//value="Javeed"  id="personal_txtEmpLastName"
		
		By personalDetails_EmployeeLastNameLocator=By.id("personal_txtEmpLastName");
		WebElement personalDetails_EmployeeLastName=driver.findElement(personalDetails_EmployeeLastNameLocator);
		String personalDetails_EmployeeLastNameText=personalDetails_EmployeeLastName.getAttribute("value");
		System.out.println(" The Employee Middle Name Text is:- "+personalDetails_EmployeeLastNameText);
		
		Cell newRowOfCells25=newRow.createCell(26);
		newRowOfCells25.setCellValue(personalDetails_EmployeeLastNameText);
		
		//Validating Personal Details Employee Id
		
		///html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[2]/li[1]/label
		
		By personalDetails_EmployeeIdLocater=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[2]/li[1]/label");
		WebElement personalDetails_EmployeeId=driver.findElement(personalDetails_EmployeeIdLocater);
		String actual_EmployeeIdText=personalDetails_EmployeeId.getText();
		System.out.println(" The Actual Employee Id Name Text is:- "+actual_EmployeeIdText);
		
		Cell newRowOfCells26=newRow.createCell(27);
		newRowOfCells26.setCellValue(actual_EmployeeIdText); 
		
		//id="personal_txtEmployeeId" value
		
		By personalDetailsEmployee_EmployeeIdLocater=By.id("personal_txtEmployeeId");
		WebElement personalDetailsEmployee_EmployeeId=driver.findElement(personalDetailsEmployee_EmployeeIdLocater);
		String personalDetailsEmployee_EmployeeIdText=personalDetailsEmployee_EmployeeId.getAttribute("value");
		System.out.println(" The Employee ID Text is:- "+personalDetailsEmployee_EmployeeIdText);
		
		Cell newRowOfCells27=newRow.createCell(28);
		newRowOfCells27.setCellValue(personalDetailsEmployee_EmployeeIdText);
		
		
			FileOutputStream fileOutput = new FileOutputStream("./src/com/ExcelFiles/AddEmployeeTest.xlsx");
			workBook.write(fileOutput);
		
		
	}

}
