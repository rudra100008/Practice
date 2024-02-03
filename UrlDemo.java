package com.gui;

import java.io.IOException;
import java.net.URL;

public class UrlDemo {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://www.youtube.com");
            System.out.println("Url is"+url.toString());
            System.out.println("authority:"+ url.getPort());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
