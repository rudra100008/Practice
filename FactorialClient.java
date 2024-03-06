package com.NetworkProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class FactorialClient {
    public static void main(String[] args) {
        try{
            System.out.println("Client Started...");
            Socket soc = new Socket("localhost",9806);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number");
            int number = Integer.parseInt(br.readLine());
            PrintWriter pw = new PrintWriter(soc.getOutputStream(),true);
            pw.println(number);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(bufferedReader.readLine());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
