package com.company.List;


import java.util.HashSet;

public class HashSetExample1 {
	public static void main(String[] args) {
        HashSet<String> set= new HashSet<String>();
        
        set.add("Ravi");
        set.add("Hari");
        set.add("Shyam");
        set.add("Hari");
        for(String s:set) {
        	System.out.println(s);
        }
	}
	}
