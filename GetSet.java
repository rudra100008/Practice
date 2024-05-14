package com.company.List;

import java.util.*;
import java.util.List;

public class GetSet {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Orange");
		list.add("Apple");
		list.add("Papaya");
		System.out.println("CurrentList:"+list);
	    System.out.println("AfterGet:"+list.get(1));//Output:Orange
	    System.out.println("CurrentList:"+list);
	    System.out.println("AfterSet:"+list.set(1, "Papaya"));
	    System.out.println("NewList:"+list);
	}

}
