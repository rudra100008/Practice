package com.Form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame implements ActionListener {
    JTextField text1,text2;
    JPasswordField password;
    JButton b1;
    Form(){

        JLabel label = new JLabel("Username:");
        label.setBounds(20,50,100,30);
        JLabel label1 =new JLabel("Email:");
        label1.setBounds(20,100,150,30);
        JLabel label2 =new JLabel("Password:");
        label2.setBounds(20,150,150,30);

        text1 = new JTextField();
        text1.setBounds(100,50,150,40);
        text2 = new JTextField();
        text2.setBounds(100,100,150,40);
        password = new JPasswordField();
        password.setBounds(100,150,150,40);

        b1 = new JButton("Submit");
       b1.setBounds(20,200,100,50);
       b1.addActionListener(this);

       add(b1);
      add(label);add(label1);add(label2);
      add(text1);add(text2);add(password);
      setLayout(null);
      setSize(1000,1000);
      setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            String name = text1.getText();
            String email =text2.getText();
            char[] pass = password.getPassword();
            System.out.println("Name:"+ name);
            System.out.println("Email:"+ email);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setVisible(true);
         new Form();

    }
}
