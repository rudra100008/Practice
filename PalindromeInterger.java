package com.company.LeetCode;

import java.util.Scanner;

public class PalindromeInterger {
	public static boolean isPalindrome(int x) {
	    String str = String.valueOf(x);
	    int left = 0;
	    int right = str.length() - 1;

	    while (left < right) {
	        if (str.charAt(left) != str.charAt(right)) {
	            return false;
	        }
	        left++;
	        right--;
	    }
	    return true;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=scanner.nextInt();
		if (isPalindrome(x)==true) {
			System.out.printf("The number %d is palindrome",x);
		}else {
			System.out.printf("The number %d is not palindrome",x);
		}
	}

}
