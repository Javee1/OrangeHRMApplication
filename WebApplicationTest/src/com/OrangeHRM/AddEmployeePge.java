package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddEmployeePge {

	public static void main(String[] args) throws InterruptedException {
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
	    
	    String expected_Text="Full Name";
	    System.out.println(" The Expected Text of Add Employee Page is:- "+expected_Text);
	    
	    //<label class="hasTopFieldHelp">Full Name</label>
	    By fullNameLocater=By.className("hasTopFieldHelp");
	    WebElement fullName=driver.findElement(fullNameLocater);
	    String actual_Text=fullName.getText();
	    System.out.println(" The Actual Text of Add Employee Page is:- "+actual_Text);
	    
	    if(actual_Text.equals(expected_Text))
	    {
	    	System.out.println(" The Text of Full Name is Matched - PASS ");
	    }
	    else
	    {
	    	System.out.println(" The Text of Full Name is NOT Matched - FAIL ");
	    }
	    
	    //<input class="formInputText validation-error" 
	    //maxlength="30" type="text" name="firstName" id="firstName">
	    
	    String firstNameTestData="Shaik";
	    By firstNameLocater=By.id("firstName");
	    WebElement firstName=driver.findElement(firstNameLocater);
	    firstName.sendKeys(firstNameTestData);
	    
	    //<input class="formInputText valid" maxlength="30" 
	    //type="text" name="middleName" id="middleName">
	    
	    String middleNameTestData="Cf";
	    By middleNameLocater=By.id("middleName");
	    WebElement middleName=driver.findElement(middleNameLocater);
	    middleName.sendKeys(middleNameTestData);
	    
	    //<input class="formInputText validation-error" maxlength="30" 
	    //type="text" name="lastName" id="lastName">
	   
	    String lastNameTestData="Javeed";
	    By lastNameLocater=By.id("lastName");
	    WebElement lastName=driver.findElement(lastNameLocater);
	    lastName.sendKeys(lastNameTestData);
	    
	    //<input class="formInputText valid" maxlength="10" 
	    //type="text" name="employeeId" value="0001" id="employeeId">
	    
	   //The Employee ID is Already Exist In The Twxt Box
	    
	  
	    //<input type="button" class="" id="btnSave" value="Save">
	    
	    By saveButtonLocater=By.id("btnSave");
	    WebElement saveButton=driver.findElement(saveButtonLocater);
	    saveButton.click();
	    
	    //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPersonalDetails/empNumber/0001">Personal Details</a>
	   
	    By personalDetailsLocater=By.partialLinkText("Personal Details");
	    WebElement personalDetails=driver.findElement(personalDetailsLocater);
	    personalDetails.click();
	    
	   	System.out.println(" The script is Pass ");
	    	
	    	//<input value="Shaik" type="text" name="personal[txtEmpFirstName]" 
	    	//class="block default editable" maxlength="30"
	    	//title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
	    	
	   	By actual_FirstNameLocater=By.id("personal_txtEmpFirstName");
	   	WebElement actual_FirstName=driver.findElement(actual_FirstNameLocater);
	   	String firstNameAttribute=actual_FirstName.getAttribute("value");
	   	System.out.println(" The Actual Text Of First Name is:- "+firstNameAttribute);
	   	
	   	//<input value="Cf" type="text" name="personal[txtEmpMiddleName]" 
	   	//class="block default editable" maxlength="30" 
	   	//title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
	   	By actual_MiddleNameLocater=By.id("personal_txtEmpMiddleName");
	   	WebElement actual_MiddleName=driver.findElement(actual_MiddleNameLocater);
	    String middleNameAttribute=actual_MiddleName.getAttribute("value");
	    System.out.println(" The Actual Text Of Middle Name is:- "+middleNameAttribute);
	    
	    //<input value="Javeed" type="text" name="personal[txtEmpLastName]"
	    //class="block default editable" maxlength="30" 
	    //title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
	    By actual_LastNameLocater=By.id("personal_txtEmpLastName");
	    WebElement actual_LastName=driver.findElement(actual_LastNameLocater);
	    String lastNameAttribute=actual_LastName.getAttribute("value");
	    System.out.println(" The Actual Text Of Last Name is:- "+lastNameAttribute);
	    
	    //<input value="0043" type="text" name="personal[txtEmployeeId]" maxlength="10" 
	    //class="editable" id="personal_txtEmployeeId" disabled="disabled">
	    By employeeIdLocater=By.id("personal_txtEmployeeId");
	    WebElement employeeId=driver.findElement(employeeIdLocater);
	    String employeeIdAttribute=employeeId.getAttribute("value");
	    System.out.println(" The Actual Text Of EmployeeID is:- "+employeeIdAttribute);
	    
	    //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	    By welcomeAdminLocater=By.id("welcome");
	    WebElement welcomeAdmin=driver.findElement(welcomeAdminLocater);
	    welcomeAdmin.click();
	   
	    
	    Thread.sleep(10000);
	    
	    //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	    
	    By logOutLocater=By.partialLinkText("Logout");
	    WebElement logOut=driver.findElement(logOutLocater);
	    logOut.click();
	    
	   driver.quit(); 
	    	    
	    
	}

}
