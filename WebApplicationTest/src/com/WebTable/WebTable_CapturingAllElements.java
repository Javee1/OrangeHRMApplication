package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseTest.BaseTest;

public class WebTable_CapturingAllElements extends BaseTest{
	
	public void capturingAllElementsTest()
	{
		
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[2]
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[35]/td[7]/a
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[35]/td[8]
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[2]
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]/a
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[2]
		
		//String elements[][]=new String[36][8];
		
		
		
		
		
		
		for(int rowindex=1;rowindex<=36;rowindex++)
		{
			By rowofElementLocater=By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td[1]");
			WebElement rowofElement=driver.findElement(rowofElementLocater);
			String rowofElementText=rowofElement.getText();
			System.out.println(rowindex+"-"+rowofElementText);
			
			
		
		
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[35]/td[8]
		/*

		for(int cellindex=2;cellindex<=36;cellindex++)
		{
			By cellofElementLocater=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td["+cellindex+"]");
			WebElement cellofElement=driver.findElement(cellofElementLocater);
			String cellofElementText=cellofElement.getText();
			System.out.println(cellindex+"-"+cellofElementText);
		
		}
	
		*/
		
		}
		
		
	}
	public static void main(String[] args) {
		
		WebTable_CapturingAllElements obj=new WebTable_CapturingAllElements();
		obj.setUp();
		
		obj.capturingAllElementsTest();
		
		
	}
	
	
	
	

}
