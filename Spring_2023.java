package com.gui;

import javax.swing.*;
import java.awt.*;

public class Spring_2023 extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(20,30,200,150);
        g.setColor(Color.GREEN);
        g.fillOval(80,75,100,75);
        g.setColor(Color.black);
        g.drawRect(20,30,200,150);
    }
    JTextField textField ;
    public static void main(String[] args) {
        JFrame frame= new JFrame("2023fall 4b");
        JTextField textField = new JTextField("All The Best");
        textField.setBounds(90,90,80,20);
        frame.add(textField);
        frame.add(new Spring_2023());
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
