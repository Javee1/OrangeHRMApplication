package com.JumpStatements;

public class ContinueStatementExample {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println("selenium");
			if(i==3) {
				System.out.println(i+"webdriver");
				continue;//skips the current iteration and continues with rest of the iterations 
				          //depending on the condition
			}
			System.out.println(i+"livetech");
		}

	}

}
