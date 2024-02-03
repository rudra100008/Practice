package com.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample  extends JFrame implements ActionListener {
    CardLayout cardLayout;
    JButton b1,b2,b3;
    Container container;
     public CardLayoutExample(){
         container =getContentPane();
         cardLayout = new CardLayout(40,30);
         b1=new JButton("1");
         b2= new JButton("2");
         b3=new JButton("3");
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         cardLayout =new CardLayout();
         container.add(b1);
         container.add(b2);
         container.add(b3);
         container.setLayout(cardLayout);

         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setSize(400,400);
         setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.next(container);
    }


    public static void main(String[] args) {
        new CardLayoutExample();
    }


}
