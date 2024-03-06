package com.NetworkProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class String_Server {
    public static void main(String[] args) {
        try{
            System.out.println("Waiting for request......");
            ServerSocket serverSocket = new ServerSocket(3306);
            Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str =in.readLine();
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
            System.out.println("Message got: "+str);
            printWriter.println("Server says: "+str);

        }catch(Exception e){
            System.err.println("ERROR:"+e.getMessage());

        }
    }
}
