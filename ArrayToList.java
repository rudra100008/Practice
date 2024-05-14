package com.company.List;

import java.util.*;

public class ArrayToList {
	public static void main(String[] args) {
		String[] subject= {"Nepali","Math","Science","Social"};
		System.out.println("Array:"+ Arrays.toString(subject));
		
		List<String> list= new ArrayList<String>();
		
		System.out.println(list.isEmpty());
		for(String s:subject) {
			list.add(s);
		}
		System.out.println(list.isEmpty());
		System.out.println("Removed From list:"+list.remove(1));
		
		System.out.println("List"+list);
	}

}
