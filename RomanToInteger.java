package com.company.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
	public   int  romanToInt(String s) {
		
		Map<Character, Integer> romanValue= new HashMap<Character, Integer>();
		romanValue.put('I', 1);
		romanValue.put('V', 5);
		romanValue.put('X', 10);
		romanValue.put('L', 50);
		romanValue.put('C', 100);
		romanValue.put('D', 500);
		romanValue.put('M', 1000);
		
		int total=0;
		int prevValue=0;
		
		for(int i=s.length()-1;i>=0;i--) {
			
			char currentChar=s.charAt(i);
		    int currentValue=romanValue.get(currentChar);
		    
		    if(currentValue<prevValue) {
		    	total -=currentValue;
		    }else {
		    	total +=currentValue;
		    }
		    prevValue=currentValue;
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		RomanToInteger object= new RomanToInteger();
		System.out.println("Enter the Roman Number:");
		String romanNumber=scanner.next();
		int number =object.romanToInt(romanNumber);
		System.out.println("The number is:"+number);
		scanner.close();
	}

}
