package com.NetworkProgramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(9806);
        byte[] receiveData = new byte[1024];
        while(true){
            DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
            serverSocket.receive(receivePacket);///Receive data from client
            String message = new String(receivePacket.getData(),0,receivePacket.getLength());
            System.out.println("Received from client: "+message);
            InetAddress serverIP =receivePacket.getAddress();
            int serverPort =receivePacket.getPort();
            String responseMessage = "Hello UDPClient!!I have received message ";
            byte[] sendData =responseMessage.getBytes();
            DatagramPacket  sendPacket = new DatagramPacket(sendData,sendData.length,serverIP,serverPort);
            serverSocket.send(sendPacket);

        }


    }
}
