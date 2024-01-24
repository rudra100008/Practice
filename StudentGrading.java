package com.if_else;

import java.util.Scanner;

public class StudentGrading {
    StudentGrading() {
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        if (grade > 89 && grade < 100) {
            System.out.println("Your Grade is:" + "A");
        }
        if (grade > 79 && grade < 90) {
            System.out.println("Your Grade is:" + "B");
        }
        if (grade >= 70 && grade < 80) {
            System.out.println("Your grade is:" + "C");
        }

        if (grade >= 60 && grade < 70) {
            System.out.println("Grade: D");
        } else if (grade<60){
            System.out.println("Grade: F");
        }
    }


    public static void main(String[] args) {
        new StudentGrading();
    }
}

