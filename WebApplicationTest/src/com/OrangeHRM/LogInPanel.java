package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInPanel {
	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
		String expected_LogInPanelText="LOGIN Panel";
				
		System.out.println(" The Expected Login panel Text is:- "+expected_LogInPanelText);
		
		//<div id="logInPanelHeading">LOGIN Panel</div>
		
		By logInPanelLocator=By.id("logInPanelHeading");
		WebElement logInPanel=driver.findElement(logInPanelLocator);
		String actual_LogInPanelText=logInPanel.getText();
		
		if(actual_LogInPanelText.contains(expected_LogInPanelText))
		{
			System.out.println(" The OrangeHRM Login Panel Text is Matched - PASS ");
		}
		else
		{
			System.out.println(" The OrangeHRM Login Panel Text is NOT Matched - FAIL ");
		}
		
		driver.close();
	}

}
