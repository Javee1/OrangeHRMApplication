package com.JQuary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragMeToMyTargetText {
	
	WebDriver driver;
	String applicationURLAddress="https://jqueryui.com/droppable/";
	
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "./ChromeBrowser/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationURLAddress);
		
	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
	public void frame_DragMeToMyTargetText()
	{
		
	//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
		By webFrameLocator=By.className("demo-frame");
		WebElement webFrame=driver.findElement(webFrameLocator);
		
		driver.switchTo().frame(webFrame);
		
		//id="draggable"
		
		By dragMeToMyTargetLocator=By.id("draggable");
		WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetLocator);
		String dragMeToMyTargetText=dragMeToMyTarget.getText();
		System.out.println(" The Text of the Element Drag Me To My Target is:- "+dragMeToMyTargetText);
		
	}
	
	public static void main(String[] args) {
		
		DragMeToMyTargetText obj = new DragMeToMyTargetText();
		
		obj.setUp();
		
		obj.frame_DragMeToMyTargetText();
		
	}
	

}
