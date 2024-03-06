package com.NetworkProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class PalindromeClient {
    public static void main(String[] args) throws Exception{
        try {
            System.out.println("Client request");
            Socket clientSocket = new Socket("localhost", 9806);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a String:");
            String str = br.readLine();
            PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
            printWriter.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println(in.readLine());
        }catch (SocketException se){
            System.out.println(se.getMessage());
        }

    }
}
