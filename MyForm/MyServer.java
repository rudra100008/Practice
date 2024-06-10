package com.company.MyForm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
public static void main(String[] args) throws IOException{
	ServerSocket server=new ServerSocket(9090);
    System.out.println("Listeninh in 9090 port.....");
	while(true){
		Socket serverSocket=server.accept();
		new ClientHandler(serverSocket).start();
	}
	
}
}

class ClientHandler extends Thread{
	private Socket serverSocket;
	public ClientHandler(Socket socket) {
		this.serverSocket=socket;
	}
	
	public void run() {
		try {
			
			PrintWriter out=new PrintWriter(serverSocket.getOutputStream());
			BufferedReader in=new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
			String received;
			while((received=in.readLine())==null){
				System.out.println("Received: "+received);
				out.println("Echo: "+received);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
