package com.ConditionalStatements;

public class IfElseIfExample {
	public static void main(String[] args) {
		int var1=20;
		int var2=30;
		int var3=40;
		
		if(var1>var2)
		{
			System.out.println(" var1 value is greater then var2 value ");
		}
	
		else if(var2>var3) 
		{
			System.out.println(" var2 value is less than var3 value ");
		}
		else 
		{
			System.out.println(" var3 value is greater then var1 and var2 values ");
		}
				
			
	}

}
