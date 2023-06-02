package com.Arrays;

public class ObjectArray {
	
	public static void main(String[] args) {
		
		//Object arrayName[]=new Object[size];
		
		Object array1[]=new Object[4];
		
		array1[0]=10;
		array1[1]="selenium";
		array1[2]=30.123;
		array1[3]='A';
		
		for(int index=0;index<=3;index++)
		{
			
			System.out.println(array1[index]);
			
		}
		
		System.out.println(" ********** ");
		
		for(int index=0;index<array1.length;index++)
		{
			
			System.out.println(array1[index]);
			
		}
		
		
		
		
	}

}
