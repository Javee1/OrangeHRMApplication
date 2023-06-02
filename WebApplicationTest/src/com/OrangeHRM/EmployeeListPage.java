package com.OrangeHRM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EmployeeListPage {
	
	WebDriver driver;
	String applicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationURLAddress);	
		
	}
/*
	@AfterTest
	public void tearDown()
	{
		
		driver.quit();
	}
	*/
	@Test(priority=1,description=" Validating The LogIn Functionality ")
	public void orangeHRMLogInTest()
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
	
	@Test(priority=2,description=" Navigating to PIM And Employee List")
	public void pimTest()
	{
		
		 Actions pimAction;
		    By pimLocater=By.id("menu_pim_viewPimModule");
		    WebElement pim=driver.findElement(pimLocater);
		    pimAction=new Actions(driver);
		    pimAction.moveToElement(pim).build().perform();
		    
		    //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewEmployeeList/reset/1"
		    //id="menu_pim_viewEmployeeList">Employee List</a>
		    
		    By addEmployeeLocater=By.partialLinkText("Employee List");
		    WebElement addEmployee=driver.findElement(addEmployeeLocater);
		    addEmployee.click();
	}
	
	@Test(priority=3,description=" Capturing the Table Data ")
	public void capturingEmployeeTableDataTest() throws IOException
	{
		
		///html/body/div[1]/div[3]/div[2]/div
		
		//By tableDataLocator=By.xpath("/html/body/div[1]/div[3]/div[2]/div");
		//WebElement tableData=driver.findElement(tableDataLocator);
		
		FileInputStream fileInput=new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(fileInput);
		XSSFSheet testDataSheet=workBook.getSheet("Sheet1");
				
		
		
		///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[2]
		
		String xpathExpression1="/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[";
		String xpathExpression2="]/td[";
		String xpathExpression3="]";
		
		//By rowsLocator=By.tagName("tr");
		//List<WebElement>rows=tableData.findElements(rowsLocator);
		
		for(int rowIndex=1;rowIndex<=50;rowIndex++)
		{
			
			Row newRow = testDataSheet.createRow(rowIndex);
			//By rowOfCellsLocator=By.tagName("td");
			//List<WebElement>rowOfCells=tableData.findElements(rowOfCellsLocator);
			//By nextPageLocater=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[1]/ul/li[6]/a");
			//WebElement nextPage=driver.findElement(nextPageLocater);
			//nextPage.click();
			
			for(int rowOfCellIndex=1;rowOfCellIndex<=4;rowOfCellIndex++)
			{
				
				Cell newRowOfCells=newRow.createCell(rowOfCellIndex);
				By tableLocater=By.xpath(xpathExpression1+rowIndex+xpathExpression2+rowOfCellIndex+xpathExpression3);
				WebElement table=driver.findElement(tableLocater);
				String tableText=table.getText();
				
				newRowOfCells.setCellValue(tableText);
				
				System.out.print(tableText+" ");
				
				//String testData=rowOfCells.get(rowOfCellIndex).getText();
				//System.out.print(testData+" ");
				
				FileOutputStream fileOutput=new FileOutputStream("./src/com/ExcelFiles/TableTestData.xlsx");
				workBook.write(fileOutput);
							
				//driver.navigate().back();
				/*
				By nextPageLocater=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[1]/ul/li[6]/a");
				WebElement nextPage=driver.findElement(nextPageLocater);
				nextPage.click();
				*/
			}
			
			//By nextPageLocater=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[1]/ul/li[6]/a");
			//List<WebElement>nextPage=driver.findElements(nextPageLocater);
			//nextPage.;
			
			//for(int rowOfCellsIndex=0;rowOfCellsIndex<nextPage;)
			
			System.out.println();
			//driver.navigate().back();
			
			
		}		
		///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[1]
		
	}
	

}
