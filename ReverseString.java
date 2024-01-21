package com.String;

public class ReverseString {
    public static void main(String[] args) {
            String s1="Hello Ashum",s2="";
            char ch;
            System.out.println("Word:"+ s1);
            for(int i = s1.length()-1; i>0; --i){
                ch=s1.charAt(i);
                s2=s2 + ch;

            }
        System.out.println("Word Reversed:"+ s2);

    }

}
