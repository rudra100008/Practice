package com.PracticeNetwork;

import javax.swing.*;
import java.awt.*;

public class Spring_4b_2023 extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw the rectangle
        g2d.setColor(Color.RED);
        g2d.fillRect(50, 100, 300, 200);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(50, 100, 300, 200);

        // Draw the circle
        g2d.setColor(Color.GREEN);
        g2d.fillOval(150, 150, 100, 100);

        Font font = new Font("Serif",Font.BOLD,12);
g2d.setFont(font);
        g2d.setColor(Color.BLACK);
        String str ="All the best";
        g2d.drawString(str,180,200);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("2D Rectangle with Circle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Spring_4b_2023());
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
