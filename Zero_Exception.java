package com.ExceptionHandling;

import java.util.Scanner;

public class Zero_Exception {
    public static <e> void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);

                System.out.println("Enter two values to divide(eg:a/b):");
                int a = input.nextInt();
                int b = input.nextInt();
                double divide =(double)a/b;
            System.out.println("The value is :"+ divide);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic ERROR:Please give proper value.");
        }
    }
}
