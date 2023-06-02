package com.Arrays;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.iterators.ArrayListIterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		//list<datatype>arraylistname=new Arraylist<>();
		
		List<Object>arraylist1=new ArrayList();
		
		arraylist1.add(10);
		arraylist1.add("selenium");
		arraylist1.add('A');
		arraylist1.add(10.123);
		
		for(int index=0;index<arraylist1.size();index++)
		{
			System.out.println(arraylist1.get(index));
			
		}
		
		System.out.println(" ******** ");
		
		for(Object index:arraylist1)
		{
			
			System.out.println(index);
			
		}
		
		
	}

}
