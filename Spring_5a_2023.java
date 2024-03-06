package com.PracticeNetwork;

import java.net.InetAddress;

public class Spring_5a_2023 {
    public static void main(String[] args) {
        try{
            InetAddress localhost = InetAddress.getLocalHost();
            String ipAddress =localhost.getHostAddress();
            System.out.println("IpAddress of Computer: "+ipAddress);

        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
