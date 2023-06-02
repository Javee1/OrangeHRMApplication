package com.StringComparision;

public class StringCompare {

	public static void main(String[] args) {
		
		String string1="Testing";
		
		System.out.println(string1.charAt(2));//it gives the character
		
	    int hello=string1.charAt(4);
	    System.out.println(hello);
	    
	    int hi=string1.charAt(3);
	    System.out.println(hi);//it gives the ASCII value
	    
	     String string2="Live Tech";
	     String string3="Live Tech";
	     
	     if(string2.equals(string3))//checks for the exact match case of each and every character 
	     {
	    	 System.out.println(" both string values string2 and string3 are NOT equal");
	     }
	     
	     String string4="Live Tech";
	     String stringToUppercase=string4.toUpperCase();
	     System.out.println(" The value of the variable string4 after converting to uppercase is :- "+stringToUppercase);
	     
	     String string5="Live Tech";
	     String stringToLowercase=string5.toLowerCase();
	     System.out.println(" The value of the variable string5 after converting to lowercase is:- "+stringToLowercase);
	     
	     String string6="Testing Tools";
	     String string7="testing tools";
	     
	     if(string6.equalsIgnoreCase(string7))
	     {
	    	 System.out.println(" Both string values string6 and string7 are Equal");
	    	 
	     }
	     else
	     {
	    	 System.out.println(" Both string values string6 and string7 are NOT Equal ");
	     }
	     
	     System.out.println(" **** ");
	     
	     int string7Length=string7.length();
	     System.out.println(" The no of characters in the variables string7 are :- "+string7Length);
	     
	     String string8="Live Tech";
	     String string9="Tech";
	     
	     if(string8.contains(string9))
	     {
	    	 System.out.println(" string Existing ");
	     }
	     else
	     {
	    	 System.out.println(" string NOT Existing ");
	     }
	}

}
