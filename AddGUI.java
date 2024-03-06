package com.Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddGUI extends JFrame  {
    AddGUI(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,0));
        panel.setSize(200,200);
        JTextField text1 = new JTextField();
        panel.add(text1);
        JTextField text2 = new JTextField();
        panel.add(text2);
        JButton submit = new JButton("Submit");
        panel.add(submit);
        JTextField text3 = new JTextField();
        panel.add(text3);

         submit.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                 int num1 =Integer.parseInt(text1.getText());
                 int num2 =Integer.parseInt(text2.getText());
                 int sum=num1+num2;
                 text3.setText(String.valueOf(sum));
             }
         });
      add(panel);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }



    public static void main(String[] args) {
        new AddGUI();
    }
}
