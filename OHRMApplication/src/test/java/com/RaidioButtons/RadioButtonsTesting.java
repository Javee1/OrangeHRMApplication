package com.RaidioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Log;

public class RadioButtonsTesting {
	
	WebDriver driver;
	String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";

	@BeforeTest
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver", "./chromeBrowser/chromedriver.exe");

	driver = new ChromeDriver();
	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();

	}

	@Test
	public void radioButtonsTesting() throws InterruptedException
	{
	/*
	<input type="radio" name="group1" value="Milk">
	<input type="radio" name="group1" value="Butter" checked="">
	<input type="radio" name="group1" value="Cheese">

	*/

	// Identifying the Radio Buttons Block
	// /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table

	By radioButtonsBlockLocator=By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table");
	WebElement radionButtonsBlock=driver.findElement(radioButtonsBlockLocator);

	By group1RadioButtonsLocator=By.name("group1");
	List<WebElement>group1RadioButtons=radionButtonsBlock.findElements(group1RadioButtonsLocator);
	System.out.println(group1RadioButtons.size());
    
    Log.info("**** The Size of the button is 3 ******** ");
	
	// Performing click operation on the Radio Buttons
	for(int radioButtonsIndex=0;radioButtonsIndex<group1RadioButtons.size();radioButtonsIndex++)
	{

	group1RadioButtons.get(radioButtonsIndex).click();

	Thread.sleep(5000);

	// to get the status of the Radio Buttons
	for(int radioButtonsStatusIndex=0;radioButtonsStatusIndex<group1RadioButtons.size();radioButtonsStatusIndex++)
	{
	System.out.println(group1RadioButtons.get(radioButtonsStatusIndex).getAttribute("value")+" - "+group1RadioButtons.get(radioButtonsStatusIndex).getAttribute("checked"));
	}

	}

	}

	@AfterTest
	public void tearDown()
	{
	driver.quit();
	}

	}


