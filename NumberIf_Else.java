package com.if_else;

import java.util.Scanner;

public class NumberIf_Else {
    NumberIf_Else(){
        Scanner input = new Scanner(System.in);
        int a=1;
        while(a>0){
            System.out.println("Enter a number :");
            int num = input.nextInt();
            if(num%2==0){
                System.out.println("The number is even:"+ num);
            }
            else if(num%2 != 0){
                System.out.println("The number is odd:" + num);
            }else{
                System.out.println("!!Error!!");
            }
        }

    }

    public static void main(String[] args) {
        new NumberIf_Else();
    }
}
