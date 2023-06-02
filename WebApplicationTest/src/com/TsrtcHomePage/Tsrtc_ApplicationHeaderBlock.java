package com.TsrtcHomePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_ApplicationHeaderBlock {

	public static void main(String[] args) {
		
		WebDriver driver;
		String tsrtcUrlAddress="https://www.tsrtconline.in/oprs-web/";
		
		
			System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.get(tsrtcUrlAddress);
			
			
			//class="menu" class="menu-wrap"
			
			By tsrtcHeaderBlockLocater=By.className("menu");
			WebElement tsrtcHeaderBlock=driver.findElement(tsrtcHeaderBlockLocater);
			
			//Tag Name - a

			By tsrtcHeaderBlockLinksLocater=By.tagName("a");
			List<WebElement>tsrtcHeaderBlockLinks=tsrtcHeaderBlock.findElements(tsrtcHeaderBlockLinksLocater);
		    int tsrtcHeaderBlockLinksCount=tsrtcHeaderBlockLinks.size();
		    System.out.println(" The no of links in the Header Block of Tsrtc Application Home Page is:- "+tsrtcHeaderBlockLinksCount);
		    
		    System.out.println();
		    
		    for(int index=0;index<tsrtcHeaderBlockLinksCount;index++)
		    {
		    	
		    	tsrtcHeaderBlockLinks.get(index).click();
		    	
		    	String webPageTittle=driver.getTitle();
		    	System.out.println(index+"-"+webPageTittle);
		    	
		    	String webPageUrlAddress=driver.getCurrentUrl();
		    	System.out.println(webPageUrlAddress);
		    	
		    	System.out.println();
		    	
		    	driver.navigate().back();
		    	
		    	tsrtcHeaderBlock=driver.findElement(tsrtcHeaderBlockLocater);
		    	tsrtcHeaderBlockLinks=tsrtcHeaderBlock.findElements(tsrtcHeaderBlockLinksLocater);
		    	
		    }
		



	}

}
