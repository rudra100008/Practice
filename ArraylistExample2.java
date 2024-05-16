package com.company.List;

import java.util.ArrayList;

public class ArraylistExample2 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Math");
		list.add("Nepali");
		list.add("Science");
		list.add("Social");
		list.add("English");
		
		for(String s:list) {
		System.out.println(s);
		}
		list.remove(2);
		System.out.println(list);
		String search="Nepali";
		if (list.contains(search)) {
			System.out.println("The list contains "+search);
			
		}else {
			System.out.println("The list doesnot contains "+search);
			
		}
	}

}
