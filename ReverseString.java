package com.Syntax_Array;
import java.util.Iterator;
//Write a Java program that takes a string as input and returns a new string with the words 
//reversed in their order. However, the program should also handle the following edge cases:
//Empty String or String with Only Spaces: If the input string is empty or consists only of 
//whitespace characters (spaces, tabs, newlines), the program should return an empty string.
//Multiple Consecutive Spaces: If the input string contains multiple consecutive spaces, 
//the program should collapse them into a single space in the reversed output string.
import java.util.Scanner;

public class ReverseString {
	public static String reverseString(String sentence) {
	    if (sentence.isEmpty()) {
	        return ""; 
	    }

	    char[] tempChar = new char[sentence.length()];
	    char[] c= sentence.toCharArray();
	    for (int i = sentence.length() - 1, j = 0; i >= 0; i--, j++) {
	        tempChar[j] = c[i];
	    }
	    return new String(tempChar); // Return the reversed String object
	}
	
	
	public static void main(String[] args) {
//		Scanner input =new Scanner(System.in);
//		System.out.println("Enter a Sentence:-");
//		String sentence=input.nextLine();
		 String sentence="I am Ashum";
		
		System.out.println(reverseString( sentence));
		
	}

}
