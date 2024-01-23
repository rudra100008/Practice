package com.String;

import java.util.Scanner;

public class Palindrome {
    Palindrome() {
        int a=1;
        Scanner scan = new Scanner(System.in);
        while (a<2){
            System.out.println("Enter a word:");
            String original = scan.nextLine();

            String reverse="";
            int b=original.length();

            for (int i = b-1; i>=0; i--) {
                char temp = original.charAt(i);
                reverse =reverse + temp;
            }
            if(original.equals(reverse)){
                System.out.println("The word is reversed."+"\n"+"Palindrome is:"+ reverse);
            }
            else{
                System.out.println("The word is not palindrome");
            }
        }

    }

        public static void main (String[]args){
         new Palindrome();
        }


}





