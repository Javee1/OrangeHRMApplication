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
import org.openqa.selenium.support.ui.Select;

public class OsmaniaUniversityDropDrownSS {

	
	WebDriver driver;
	String ApplicationUrlAddress="https://www.osmania.ac.in/";
	
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(ApplicationUrlAddress);		
		
	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
	public void selectLanguageTest() throws IOException
	{
		
		//<select onchange="doGTranslate(this);" class="notranslate" id="gtranslate_selector"
		
		
		
		By selecetLanguageLocater=By.id("gtranslate_selector");
		WebElement selectLanguageDropDown=driver.findElement(selecetLanguageLocater);
		
	    
		
		//<option value="">Select Language</option>
		
		By selectLanguageOptionalLocater=By.tagName("option");
		List<WebElement>selectLanguageOptional=selectLanguageDropDown.findElements(selectLanguageOptionalLocater);
		int selectLanguageOptionalCount=selectLanguageOptional.size();
		System.out.println(" The no of Languages in the Select Language Drop Down is:- "+selectLanguageOptionalCount);
		
		for(int index=0;index<selectLanguageOptionalCount;index++)
		{
			
			selectLanguageOptional.get(index).click();
			
			
			
			Select selectLanguageSelection=new Select(selectLanguageDropDown);
			selectLanguageSelection.selectByIndex(index);
			

			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("./ApplictionScreenShot/"+index+".png"));
			
			//driver.navigate().back();
			
			
			//selectLanguageDropDown=driver.findElement(selecetLanguageLocater);
			//selectLanguageOptional=selectLanguageDropDown.findElements(selectLanguageOptionalLocater);
			
			
			
			
		}
	
		
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		OsmaniaUniversityDropDrownSS obj=new OsmaniaUniversityDropDrownSS();
		
		obj.setUp();
		obj.selectLanguageTest();
		



	}

}
