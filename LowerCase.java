package com.String;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LowerCase extends JFrame  implements ActionListener{
    JTextField tf1;
    JLabel l1;
    JButton b1,b2;
    LowerCase(){
        l1= new JLabel("Enter your Text");
        l1.setBounds(150,30,100,50);
        l1.setFont(new Font("Arial", Font.ITALIC, 14));


        tf1=new JTextField();
        tf1.setBounds(150,70,150,20);

        b1=new JButton("ToLowerCase");
        b1.setBounds(150,100,200,50);

        b2=new JButton("ToUpperCase");
        b2.setBounds(400,100,200,50);

        add(tf1);
        add(b1);
        add(l1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setSize(600,600);
        setLayout(null);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            String text = tf1.getText();
            String field = text.toLowerCase();
            tf1.setText(field);
        } else if(e.getSource()==b2) {
            String text = tf1.getText();
            String field = text.toUpperCase();
            tf1.setText(field);
        }
        else{
            System.out.println("ERROR");
        }

    }

    public static void main(String[] args) {
       new LowerCase();
    }

}
