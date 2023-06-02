package com.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_ScreenShot {
	
	WebDriver driver;
	String tsrtcUrlAddress="https://www.tsrtconline.in/oprs-web/";
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(tsrtcUrlAddress);
	}
	
	public void applicationClose()
	{
		driver.quit();
	}
	
	public void homePageScreenshotTest() throws IOException
	{
				
		//<div class="menu-wrap">
		By tsrtcHeaderBlockLocater=By.className("menu-wrap");
		WebElement tsrtcHeaderBlock=driver.findElement(tsrtcHeaderBlockLocater);

		
		
		By tsrtcHeaderBlockLinksLocater=By.tagName("a");
		 List<WebElement>tsrtcHeaderBlockLinks= tsrtcHeaderBlock.findElements(tsrtcHeaderBlockLinksLocater);
		 
		 int tsrtcHeaderBlockLinksCount=tsrtcHeaderBlockLinks.size();
		 System.out.println(" The no.of links in the Header Block of Tsrtc Application Homepage is:- "+tsrtcHeaderBlockLinksCount);
		 
		 System.out.println();
		 
		for(int index=0;index<tsrtcHeaderBlockLinksCount;index++)
		{
			
			tsrtcHeaderBlockLinks.get(index).click();
			
			
			
			String webPageTittle=driver.getTitle();
			System.out.println(webPageTittle);
			
			String webPageUrlAddress=driver.getCurrentUrl();
			System.out.println(webPageUrlAddress);
			
			System.out.println();
			
			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("./ApplictionScreenShot/"+index+".png"));
			
			driver.navigate().back();
			
			tsrtcHeaderBlock=driver.findElement(tsrtcHeaderBlockLocater);
			tsrtcHeaderBlockLinks= tsrtcHeaderBlock.findElements(tsrtcHeaderBlockLinksLocater);
			
			
			
		}
		
					
	}
	

	public static void main(String[] args) throws IOException{
		
		TSRTC_ScreenShot obj=new TSRTC_ScreenShot();
		obj.applicationLaunch();  
		obj.homePageScreenshotTest();
	    
		

	}

}
