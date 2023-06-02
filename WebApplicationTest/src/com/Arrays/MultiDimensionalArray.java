package com.Arrays;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		
		// DataType arrayName[][]=new DataType[][];
		
		String liveTech[][]=new String[2][2];
		
		liveTech[0][0]="Venkat sir";
		liveTech[0][1]="Manual Testing";
		liveTech[1][0]="Srini";
		liveTech[1][1]="Selenium";
		
		for(int rowIndex=0;rowIndex<=1;rowIndex++)
		{
			
			for(int rowofCellIndex=0;rowofCellIndex<=1;rowofCellIndex++)
			{
				
				System.out.print(liveTech[rowIndex][rowofCellIndex]+" ");
			}
			System.out.println();
		}
		
		
	}

}
