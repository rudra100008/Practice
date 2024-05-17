package com.company.List;

import java.util.LinkedList;



public class LInkListExample1 {
public static void main(String[] args) {
	LinkedList<String> list= new LinkedList<String>();

	list.addLast("Math");
	list.addLast("Science");
	list.addLast("Nepali");
	list.addLast("Social");
	list.addLast("English");
	
   System.out.println(list);
	System.out.println(list.peekFirst());
System.out.println(list.peekLast());
}
}
