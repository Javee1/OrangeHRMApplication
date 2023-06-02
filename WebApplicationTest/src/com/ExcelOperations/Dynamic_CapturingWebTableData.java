package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseTest.BaseTest;

public class Dynamic_CapturingWebTableData extends BaseTest {
	
	
	public void capturingWebTableDataTest() throws IOException
	{
	
	//Identifying the file (excel file) in the system
		FileInputStream excelTestDataFile= new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
		XSSFWorkbook workBook= new XSSFWorkbook(excelTestDataFile);
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");
		
	// /html/body/div[5]/section[1]/div
	
	By webTableDataLocater=By.xpath("/html/body/div[5]/section[1]/div");
	WebElement WebTable=driver.findElement(webTableDataLocater);
	
	///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	
	By rowsLocater=By.tagName("tr");
	List<WebElement>rows=WebTable.findElements(rowsLocater);
	
	
	//of the WebTable should go to all the rows
	for(int rowIndex=0;rowIndex<rows.size();rowIndex++)
	{
				
		Row newRow=testDataSheet.createRow(rowIndex);
		
		By rowofCellsLocater=By.tagName("td");
		List<WebElement>rowofCells=rows.get(rowIndex).findElements(rowofCellsLocater);
		
		for(int rowOfCellIndex=0;rowOfCellIndex<rowofCells.size();rowOfCellIndex++)
		{
			
			Cell newRowOfCells=newRow.createCell(rowOfCellIndex);
			
			String testData=rowofCells.get(rowOfCellIndex).getText();
			
			newRowOfCells.setCellValue(testData);
			
			System.out.print(testData+" ");
			
			FileOutputStream fileOutput = new FileOutputStream("./src/com/ExcelFiles/DynamicWebTableData.xlsx");
			workBook.write(fileOutput);
					
		}
		System.out.println();
		
	}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		Dynamic_CapturingWebTableData obj = new Dynamic_CapturingWebTableData();
		obj.setUp();
		obj.capturingWebTableDataTest();
		obj.tearDown();
		
	}
	

}
