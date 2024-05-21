package com.company.List;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<String> set= new TreeSet<String>();
		set.add("Narayantar");
		set.add("Jorpati");
		set.add("Chabhail");
		set.add("Gokarna");
		System.out.println(set);
		for(String s:set) {
			System.out.println(s);
		}
		System.out.println("\n");
		Iterator<String> iterator =set.descendingIterator();
	    while(iterator.hasNext()) {
	    	System.out.println(iterator.next());
	    }
	    
	    TreeSet<Integer> number= new TreeSet<Integer>();
	    number.add(12);
	    number.add(14);
	    number.add(66);
	    number.add(45);
	    number.add(90);
	    number.add(67);
	    System.out.println("\n Number:"+number);
	    System.out.println("Lowest Value:"+number.pollFirst());
	    System.out.println("Highest Value:"+number.pollLast());
	    
	    
	}

}
