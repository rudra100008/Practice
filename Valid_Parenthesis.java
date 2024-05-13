package com.company.LeetCode;

import java.util.Stack;

public class Valid_Parenthesis {

	public static boolean isValid(String s) {
			Stack<Character>stack=new Stack<>();
			for (char c:s.toCharArray()) {
				if (c=='(' || c=='{' || c=='[') {
					stack.push(c);
				}
				else if (c==')' && !stack.empty() && stack.peek()=='(') {
					stack.pop();
				}
				else if (c=='}' && !stack.empty() && stack.peek()=='{') {
					stack.pop();
				}
				else if (c==']' && !stack.empty() && stack.peek()=='[') {
					stack.pop();
				}else {
					return false;
				}
			}
				
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		
		String s="()";
		boolean correct= isValid(s);
		if (correct) {
		System.out.println( "Output:"+ correct);	
		}else {
		System.out.println("Output:"+correct);	
		}
	}
	
}
