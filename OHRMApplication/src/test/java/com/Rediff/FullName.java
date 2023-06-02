package com.Rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

public class FullName extends BaseTest{
	
	@Test
	public void fullNameTest() throws InterruptedException
	{
		
		//id="tblcrtac"
		
		By blockLocater=By.id("tblcrtac");
		WebElement block=driver.findElement(blockLocater);
       	
		
		///html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input
		
		Thread.sleep(10000);
		
		 String fullNameTestData="Shaik Cf Javeed";
	  By fullNameLocator=By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input");
	  WebElement fullName=driver.findElement(fullNameLocator);
	  fullName.sendKeys(fullNameTestData);
		
	}
	
	

}
