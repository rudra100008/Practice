package com.NetworkProgramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        InetAddress serverIP =InetAddress.getByName("localhost");
        int serverPort =9806;
        String message ="Hello UDPServer";
        byte[] sendData =message.getBytes();
        DatagramPacket clientPacket =new DatagramPacket(sendData,sendData.length,serverIP,serverPort);
        ds.send(clientPacket);
        byte[] receiveData = new byte[1000];
        DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
        ds.receive(receivePacket);
        String responseMessage =new String(receivePacket.getData(),0,receivePacket.getLength());
        System.out.println("Received from SERVER:"+responseMessage);

    }
}
