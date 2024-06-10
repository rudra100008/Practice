package com.company.MyForm;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyWindow extends JFrame {
	private static final long serialVersionUID = 1L;
   private JLabel heading;
   private  Font font=new Font("Arial",Font.BOLD,20);
   private JPanel panel;
   private JLabel name;
   private JLabel password;
   private JTextField nameField;
   private JPasswordField passwordField;
   private JButton submit,reset;
   
   
   public MyWindow() {
	
	super.setTitle("Form");
	
	super.setSize(500,500);
	super.setLocation(600,50);
	this.createGUI();
	super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	super.setVisible(true);
	System.out.println("This is constructor");
  }

public void createGUI() {
	this.setLayout(new BorderLayout());
	heading =new JLabel("My Form");
	heading.setFont(font);
	heading.setHorizontalAlignment(JLabel.CENTER);
	this.add(heading,BorderLayout.NORTH);
	this.createPanel();
    }

   public void createPanel() {
	panel=new JPanel();
	panel.setLayout(new GridLayout(3,2));
	name=new JLabel("Enter your name: ");
	name.setFont(font);
	
	password =new JLabel("Enter your password:");
	password.setFont(font);
	
	nameField=new JTextField();
	nameField.setFont(font);
	
	passwordField = new JPasswordField();
	passwordField.setFont(font);
	
	submit=new JButton("Submit");
	submit.setFont(font);
	submit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
				sendDatatoServer();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
        }
    });
	
	reset=new JButton("Reset");
	reset.setFont(font);
	
	
	panel.add(name);
	panel.add(nameField);
	panel.add(password);
	panel.add(passwordField);
	panel.add(submit);
	panel.add(reset);
	
	this.add(panel,BorderLayout.CENTER);
	
  }
   
   public void sendDatatoServer() throws Exception{
	   String name=nameField.getName();
	   String password=(String)passwordField.getName();
	   try {
		   Socket clientSocket=new Socket("Localhost",9090);
		   PrintWriter out=new PrintWriter(clientSocket.getOutputStream());
		   BufferedReader in=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		   
		   out.write("\nName: "+name+"\nPassword: "+password);
		   String response=in.readLine();
		   System.out.println("Server says: "+response);
		   out.close();
		   in.close();
		   clientSocket.close();
		   
	   }catch(Exception e){
		System.out.println("Error in Client Side: "+e.getMessage());
	   }
   }
}
