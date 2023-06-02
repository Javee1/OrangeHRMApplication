package com.JQuary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JQuery_DragAndDrop {
	
	WebDriver driver;
	String applicationURLAddress="https://jqueryui.com/droppable/";
	
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
	@Test
	public void frame_DragAndDropTest()
	{
		
	//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
		By webFrameLocator=By.className("demo-frame");
		WebElement webFrame=driver.findElement(webFrameLocator);
		
		driver.switchTo().frame(webFrame);
		
		//id="draggable"
		
		By dragMeToMyTargetLocator=By.id("draggable");
		WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetLocator);
		
		//id="droppable"
		
		By dropHereLocator=By.id("droppable");
		WebElement dropHere=driver.findElement(dropHereLocator);
		
		Actions dragAndDropActions =new Actions(driver);
		dragAndDropActions.dragAndDrop(dragMeToMyTarget, dropHere).build().perform();
		
		
	}
	

}
