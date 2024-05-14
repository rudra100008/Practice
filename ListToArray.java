package com.company.List;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Orange");
		list.add("Apple");
		list.add("Papaya");
		System.out.println("list:"+list);
		String[] array=list.toArray(new String[list.size()]);
		System.out.println(  "Array:"+Arrays.toString(array));
	}

}
