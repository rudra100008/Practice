package com.NetworkProgramming;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class PalindromeServer {
    static String palindrome(String str){

            String reverse ="";
            int length =str.length();
            for (int i=length-1;i>=0;i--){
                char temp =str.charAt(i);
                reverse = reverse + temp;
            }
            if (str.equals(reverse)){
                return reverse +" is palindrome";
            }else {
                return  str + " is not palindrome";
            }

    }
    public static void main(String[] args) throws  Exception {
        try {
            System.out.println("Server is listening in  9806");
            ServerSocket serverSocket = new ServerSocket(9806);
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str = br.readLine().toLowerCase();
            String message = palindrome(str);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("Server Says: " + message);
        }catch (SocketException se){
            System.out.println(se.getMessage());
        }
    }
}
