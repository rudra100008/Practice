package com.company.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkListExample3 {
	public static void main(String[] args) {
		Queue<String> list= new LinkedList<String>();
		list.add("Amit");  
		list.add("Vijay");  
		list.add("Karan");  
		list.add("Jai");  
	    list.add("Rahul"); 
	    System.out.println(list.element());
	    System.out.println(list.peek());
	    System.out.println(list);
	    for(int i=0;i<2;i++) {
	   list.remove();
	    }
	   System.out.println(list);
	}

}
