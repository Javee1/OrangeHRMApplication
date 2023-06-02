package com.OrangeHRMApplicationWebPagesTests;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationWebPages.OrangeHRMHomePage;
import com.Utility.Log;

public class OrangeHRMHomePageTest extends BaseTest{
	
	OrangeHRMHomePage homePage;

	@Test(priority=1,description="Validating LogIn page LogInPanel Text")
	public void validatingLogInPageTextTest()
	{
		homePage= new OrangeHRMHomePage();
		homePage.validatingLogInPageText();
		
		Log.info(" Validating LogIn Page LogInPanel Text Successfull - Naviagated to LogIN Page");
		
	}
	
	
	@Test(priority=2,description="Validating LogIn Functionality")
	public void validatingLogInTest()
	{
		homePage= new OrangeHRMHomePage();
		homePage.validatingLogIn("javeed", "Asijavee@123");
		
		Log.info("Validation of LogIn functionality Successfull");
		
	}
	
	@Test(priority=3)
	public void validatingHomePageAdminTest()
	{
		
		homePage=new OrangeHRMHomePage();
		homePage.validatingHomePageAdmin("javeed", "Asijavee@123");
		
		Log.info("Validation of Home Page Admin functionality Successfull");
		
	}
	
	@Test(priority=4)
	public void validatingHomePagePimTest()
	{
		
		homePage=new OrangeHRMHomePage();
		homePage.validatingHomePagePim("javeed", "Asijavee@123");
		
		Log.info("Validation of Home Page PIM functionality Successfull");
		
		
	}
	
	@Test(priority=5)
	public void validatingHomePageLeaveTest()
	{
		homePage=new OrangeHRMHomePage();
		homePage.validatingHomePageLeave("javeed", "Asijavee@123");
		
		Log.info("Validation of Home Page Leave functionality Successfull");
		
	}
	
	@Test(priority=6)
	public void validatingHomePageTimeTest()
	{
		homePage=new OrangeHRMHomePage();
		homePage.validatingHomePageTime("javeed", "Asijavee@123");
		
		Log.info("Validation of Home Page Time functionality Successfull");
		
	}
	
	@Test(priority=7)
	public void validatingHomePageRecruitmentTest()
	{
		homePage=new OrangeHRMHomePage();
		homePage.validatingHomePageRecruitment("javeed", "Asijavee@123");
		
		Log.info("Validation of Home Page Recruitment functionality Successfull");
		
	}
	
	@Test(priority=8)
	public void validatingHomePagePerformanceTest()
	{
		homePage=new OrangeHRMHomePage();
		homePage.validatingHomePagePerformance("javeed", "Asijavee@123");
		
		Log.info("Validation of Home Page Performance functionality Successfull");
			
	}
	
	@Test(priority=9)
	public void validatingHomePageDashboardTest()
	{
		
		homePage=new OrangeHRMHomePage();
		homePage.validatingHomePageDashboard("javeed", "Asijavee@123");
		
		Log.info("Validation of Home Page Dashboard functionality Successfull");
		
	}
	
	@Test(priority=10)
	public void validatingHomePageDirectoryTest()
	{
		homePage=new OrangeHRMHomePage();
		homePage.validatingHomePageDirectory("javeed", "Asijavee@123");
		
		Log.info("Validation of Home Page Directory functionality Successfull");
		
	}
	
	@Test(priority=11)
	public void validatingHomePageMaintenanceTest()
	{
		homePage=new OrangeHRMHomePage();
		homePage.validatingHomePageMaintenance("javeed", "Asijavee@123");
		
		Log.info("Validation of Home Page Maintenance functionality Successfull");
		
	}
}
