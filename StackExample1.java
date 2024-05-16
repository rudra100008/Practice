package com.company.List;


import java.util.Scanner;
import java.util.Stack;

public class StackExample1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack= new Stack<Integer>();
		
		System.out.println("Enter 5 integer elements for the stack:");
		
		int[] number= new int[5];
		for(int i=0;i<number.length;i++) {
			
		   number[i]=scanner.nextInt();
		}
		
		for(int i:number) {
		   stack.push(i);
		}
		
		System.out.println("Stack Elements:"+stack.peek());
		int num1=stack.pop();
		int num2=stack.pop();
		System.out.println("The number popped from stack:"+num1+","+num2);
		
		if (stack.isEmpty()) {
			
			System.out.println("the stack is empty");
		}else {
			
			System.out.println("The stack is not Empty"+"\nThe elements are:"+stack);
		}
		scanner.close();
	}

}
