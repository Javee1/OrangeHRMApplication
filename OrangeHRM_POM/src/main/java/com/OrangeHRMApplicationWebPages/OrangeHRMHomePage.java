package com.OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class OrangeHRMHomePage extends BaseTest{
	
	public OrangeHRMHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logInPanelHeading")
	WebElement logInPageLogInPanel;

	@FindBy(id="txtUsername")
	WebElement userName;

	@FindBy(name="txtPassword")
	WebElement password;

	@FindBy(name="Submit")
	WebElement logInPageLogInButton;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement homePageAdmin;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement homePagePim;
	
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement homePageLeave;
	
	@FindBy(id="menu_time_viewTimeModule")
	WebElement homePageTime;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement homePageRecruitment;
	
	@FindBy(id="menu__Performance")
	WebElement homePagePerformance;
	
	@FindBy(id="menu_dashboard_index")
	WebElement homePageDashboard;
	
	@FindBy(id="menu_directory_viewDirectory")
	WebElement homePageDirectory;
	
	@FindBy(id="menu_maintenance_purgeEmployee")
	WebElement homePageMaintenance;

	public void validatingLogInPageText()
	{
	String actual_LogInPageLogInPanelText=logInPageLogInPanel.getText();
	Log.info("The actual LogIn page Text is :- "+actual_LogInPageLogInPanelText);

	String expected_LogInPageLogInPanelText="LOGIN Panel";
	Log.info("The expected LogIn Page Text is :-"+expected_LogInPageLogInPanelText);

	Assert.assertEquals(actual_LogInPageLogInPanelText, expected_LogInPageLogInPanelText,
	"Failed to navigate to OrangeHRM Application LogIn Page");

	//Log.info("Failed to navigate to OHRM Application LogInPage-LogInPage Text validation Failed");

	}

	public void validatingLogIn(String userNameTestData,String passwordTestData)
	{
	userName.sendKeys(userNameTestData);
	password.sendKeys(passwordTestData);
	logInPageLogInButton.click();
	Log.info("Validating LogIn Functionality");
	}
	
	public void validatingHomePageAdmin(String userNameTestData1,String passwordTestData2)
	{
		userName.sendKeys(userNameTestData1);
		password.sendKeys(passwordTestData2);
		logInPageLogInButton.click();
		homePageAdmin.click();
		
		Log.info("validating the Home Page Admin Functionality");
		
	}
	
	public void validatingHomePagePim(String userNameTestData3,String passwordTestData4)
	{
		
		userName.sendKeys(userNameTestData3);
		password.sendKeys(passwordTestData4);
		logInPageLogInButton.click();
		homePagePim.click();
		
		Log.info("Validating the Home Page PIM Functionality");
	}
	
    public void validatingHomePageLeave(String userNameTestData5,String passwordTestData6)
    {
    	
		userName.sendKeys(userNameTestData5);
		password.sendKeys(passwordTestData6);
		logInPageLogInButton.click();
		homePageLeave.click();
		Log.info("Validating the Home Page Leave Functionality");
    }
    
    public void validatingHomePageTime(String userNameTestData7,String passwordTestData8)
    {
    	userName.sendKeys(userNameTestData7);
		password.sendKeys(passwordTestData8);
		logInPageLogInButton.click();
		homePageTime.click();
		Log.info("Validating the Home Page Time Functionality");
    	
    }
    
    public void validatingHomePageRecruitment(String userNameTestData9,String passwordTestData10)
    {
    	userName.sendKeys(userNameTestData9);
		password.sendKeys(passwordTestData10);
		logInPageLogInButton.click();
    	homePageRecruitment.click();
    	
    	Log.info("Validating the Home Page Recruitment Functionality");
    }
    public void validatingHomePagePerformance(String userNameTestData11,String passwordTestData12)
    {
    	userName.sendKeys(userNameTestData11);
		password.sendKeys(passwordTestData12);
		logInPageLogInButton.click();
    	homePagePerformance.click();
    	
    	Log.info("Validating the Home Page Performance Functionality");
    	
    }
    
    public void validatingHomePageDashboard(String userNameTestData13,String passwordTestData14)
    {
    	
    	userName.sendKeys(userNameTestData13);
		password.sendKeys(passwordTestData14);
		logInPageLogInButton.click();
    	
		homePageDashboard.click();
		
    }
    
    public void validatingHomePageDirectory(String userNameTestData15,String passwordTestData16)
    {
    	userName.sendKeys(userNameTestData15);
		password.sendKeys(passwordTestData16);
		logInPageLogInButton.click();	
    	homePageDirectory.click();
    }
    
    public void validatingHomePageMaintenance(String userNameTestData17,String passwordTestData18)
    {
    	userName.sendKeys(userNameTestData17);
		password.sendKeys(passwordTestData18);
		logInPageLogInButton.click();	
    	homePageMaintenance.click();
    	
    }

}
