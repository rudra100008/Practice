package com.company.List;

import java.util.Scanner;
import java.util.Stack;

public class StackExample2 {
public static void main(String[] args) {
	System.out.println("Enter a String:");
	Scanner scanner= new Scanner(System.in);
	String word=scanner.nextLine();
	System.out.println("originalString: "+word);
	System.out.println("Reverse String: "+reverseString(word));
}
public static String reverseString(String s) {
	Stack<Character> stack=new Stack<Character>();
   for(char c:s.toCharArray()) {
	   stack.push(c);
   }
   StringBuilder reverse= new StringBuilder();
   while(!stack.isEmpty()) {
   reverse.append(stack.pop());
   }
   return reverse.toString();
}
}
