package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationMethods {
	
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@Given("^User Should Launch Chrome Browser$")
	public void user_Should_Launch_Chrome_Browser()
	{
	  
		System.setProperty("webdriver.chrome.driver", "./ChromeBrowser/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("^User Should Enter Valid OrangeHRM Application URL Address$")
	public void user_Should_Enter_Valid_OrangeHRM_Application_URL_Address() 
	{
		
		driver.get(applicationUrlAddress);
	   
	}

	@Then("^User Should be Navigated to OrangeHRM LogIn Page$")
	public void user_Should_be_Navigated_to_OrangeHRM_LogIn_Page() 
	{
		String expected_LogInPanelText="LOGIN Panel";
		System.out.println(" The expected OrangeHRM Login Panel is:- "+expected_LogInPanelText);
		

		//<div id="logInPanelHeading">LOGIN Panel</div>
		By loginPanelLocator=By.id("logInPanelHeading");
		WebElement loginPanel=driver.findElement(loginPanelLocator);
		String actual_LogInPanelText=loginPanel.getText();
		
		System.out.println(" The Actual OrangeHRM Login Panel is:- "+actual_LogInPanelText);
		
		if(actual_LogInPanelText.equals(expected_LogInPanelText))
		{
			System.out.println("PASS");
			
		}
		else
		{
			System.out.println("FAIL");
			
		}
		
		
		// OrangeHRM Tittle Functionality 
		
		String expected_LogInPageTittle="OrangeHRM";
		System.out.println(" The Expected OrangeHRM Tittle is:- "+expected_LogInPageTittle);
		

		String actual_LogInPageTittle=driver.getTitle();
		System.out.println("The Actual OrangeHRM Tittle is:- "+actual_LogInPageTittle );

		if(actual_LogInPageTittle.contains(expected_LogInPageTittle))
		{
			System.out.println("PASS");
			
		}
		else
		{
			System.out.println("FAIL");
			
		}
		
	}
	
	@When("^User Should Enter Valid userName and Valid Password and Click On LogIn Button$")
	public void user_Should_Enter_Valid_userName_and_Valid_Password_and_Click_On_LogIn_Button()
	{
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
		
	}
	
	@When("^User Should Enter \"([^\"]*)\" and \"([^\"]*)\" and Click On LogIn Button$")
	public void user_Should_Enter_and_and_Click_On_LogIn_Button(String userName, String password) 
	{
		//identifying the property of the element under test 
				By userNameLocator=By.id("txtUsername");//finding identifying the element on the current webpage
				WebElement userNameElement=driver.findElement(userNameLocator);
				//performing operation on the element under test 
				userNameElement.sendKeys(userName);
				
				//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
				
				String passwordTestData="Asijavee@123";
				By passwordLocator=By.id("txtPassword");
				WebElement passwordElement=driver.findElement(passwordLocator);
				passwordElement.sendKeys(password);
				
				//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
				By logInButtonLocator=By.id("btnLogin");
				WebElement logInButton=driver.findElement(logInButtonLocator);
				logInButton.click();   
	}


	@Then("^User Should Navigated to HomePage Welcome Admin and Click On LogOut$")
	public void user_Should_Navigated_to_HomePage_Welcome_Admin_and_Click_On_LogOut() throws InterruptedException
	{
		 
		String expected_WelcomeAdminText="Admin";
		System.out.println("The Expected Welcome Admin Text Is:- "+expected_WelcomeAdminText);
				
				
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	    By welcomeAdminLocater=By.id("welcome");
	    WebElement welcomeAdmin=driver.findElement(welcomeAdminLocater);
	    String actual_WelcomAdminText=welcomeAdmin.getText();
	    System.out.println("The Actual Welcome Admin Text is:- "+actual_WelcomAdminText);
	    
	    if(actual_WelcomAdminText.contains(expected_WelcomeAdminText))
	    {
	    	System.out.println("PASS");
	    }
	    else
	    {
	    	System.out.println("FAIL");
	    }
	    
	    welcomeAdmin.click();
	   
	    
	    Thread.sleep(10000);
	    
	    //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	    
	    By logOutLocater=By.partialLinkText("Logout");
	    WebElement logOut=driver.findElement(logOutLocater);
	    logOut.click();
	}

	@Then("^User Should Close The Browser along With The Application$")
	public void user_Should_Close_The_Browser_along_With_The_Application()
	{
	 driver.quit(); 
	}

}
