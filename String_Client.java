package com.NetworkProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class String_Client {
    public static void main(String[] args) {
        try{
            System.out.println("Client started...");
            Socket socket = new Socket("localhost",3306);
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string");
            String str =br.readLine();
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
            printWriter.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(in.readLine());

        }catch(Exception e){
            System.err.println("Error"+e.getMessage());

        }
    }
}
