package com.company.List;

import java.util.*;

public class CollectionSort {
public static void main(String[] args) {
	List<String> fruitList=new ArrayList<String>();
	fruitList.add("Mango");
	fruitList.add("Orange");
	fruitList.add("Apple");
	fruitList.add("Papaya");
	
	Collections.sort(fruitList);
	System.out.println(fruitList);
	for(String s:fruitList)
	System.out.println(s);
	List<Integer> integers=new ArrayList<Integer>();
	integers.add(2);
	integers.add(13);
	integers.add(17);
	integers.add(100);
	integers.add(9);
	integers.add(17);
	Collections.sort(integers);
	System.out.println(integers);
for(int a:integers) {
	System.out.print("\t"+ a);
}
}
}
