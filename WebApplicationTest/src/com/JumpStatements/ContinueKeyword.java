package com.JumpStatements;

public class ContinueKeyword {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(" selenium ");
			if(i==3)
			{
				System.out.println(i+" webDriver ");
				continue;
			}
			System.out.println(i+" Testing ");
		}
	}

}
