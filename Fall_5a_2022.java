package com.PracticeNetwork;

import java.net.InetAddress;
import java.util.Scanner;

public class Fall_5a_2022 {
    public static void main(String[] args) throws  Exception {
        Scanner input = new Scanner(System.in);
        int choice=0;
        while(true) {
            System.out.println("\nMenu:");
            System.out.println("1. Print IP address associated with Netflix.com");
            System.out.println("2.Display the localhost address");
            System.out.println("3.Print thr loopBack address");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice =input.nextInt();

            switch (choice){
                case 1:
                    ipAddress();
                    break;
                case 2:
                    localHost();
                    break;
                case 3:
                    loopBack();
                    break;
                case 4:
                    System.out.println("Exit");
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public  static void  ipAddress() throws Exception{
        String url = "www.Netflix.com";
        InetAddress ipAddress= InetAddress.getByName(url);
        System.out.println("\nIpAddress of "+url+": "+ipAddress.getHostAddress());
    }
    public static  void localHost()throws Exception{
        InetAddress localhost =InetAddress.getLocalHost();
        System.out.println("\nLocalhost: "+localhost.getHostAddress());
    }
    public static void loopBack()throws Exception{
        InetAddress loopBack =InetAddress.getLoopbackAddress();
       System.out.println("\nloopBack: "+ loopBack.getHostAddress());

    }
}
