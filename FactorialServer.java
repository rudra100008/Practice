package com.NetworkProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FactorialServer {
    public static int factorial(int number){
        if (number==0){
            return 1;
        }else{
            return number * factorial(number-1);
        }
//        int fac =1;
//        for (int i=1;i<=number;i++){
//            fac=fac*i;
//        }
//        return  fac;
    }
    public static void main(String[] args) {
        try{
            System.out.println("Waiting for request");
            ServerSocket ss= new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connected to client...");
            BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int number =Integer.parseInt(br.readLine());
             int factorialNumber =factorial(number);
            PrintWriter printWriter = new PrintWriter(soc.getOutputStream(),true);
            printWriter.println("SERVER SAYS: The factorial of "+number+" is "+factorialNumber);


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
