package com.company.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExmaple {
public static void main(String[] args) {
	ArrayList<String>list= new ArrayList<String>();
	list.add("Math");
	list.add("Nepali");
	list.add("Science");
	list.add("English");
	
	
// 1st method for printing list in console
//	Iterator<String> itr=list.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
	
	//2nd method
	for(String s:list) {
		System.out.println(s);
	}
	
  list.remove("English");
  for(String s:list) {
	  ;
		System.out.println("\n"+s);
	}
  list.add(1,"Social");
  for(String s:list) {
	
		System.out.println("\n"+s);
	}
}
}
