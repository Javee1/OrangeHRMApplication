package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseTest.BaseTest;




public class ExcelRead_SingleTestData extends BaseTest{
	

	
		public void readSingleTestData() throws IOException
		{
		FileInputStream singleTestDataLocater=new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(singleTestDataLocater);
		XSSFSheet testDataSheet=workBook.getSheet("sheet1");
		
		for(int index=1;index<=36;index++)
		{
			
			By rowofElementLocater=By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]");
			WebElement rowofElement=driver.findElement(rowofElementLocater);
			String rowofElementText=rowofElement.getText();
			
			Row newRow=testDataSheet.createRow(index-1);
			
			Cell newRowofCell=newRow.createCell(0);
			
			newRowofCell.setCellValue(rowofElementText);
			
			System.out.println(index+"-"+rowofElementText);
			
			FileOutputStream fileOutput = new FileOutputStream("./src/com/ExcelFiles/RowofTestData.xlsx");
			workBook.write(fileOutput);
			
			
			
		}	
		
		
	}
		
		public static void main(String[] args) throws IOException  {
			
			ExcelRead_SingleTestData obj = new ExcelRead_SingleTestData();
			
			obj.setUp();
			obj.readSingleTestData();
			obj.tearDown();
			
			
		}
	
	
}


