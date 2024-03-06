package com.Practice;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample extends JFrame {
    BoxLayoutExample() {
        JButton north = new JButton("North");
        JButton west = new JButton("West");
        JButton center = new JButton("Center");
        JButton east = new JButton("East");
        JButton south = new JButton("South");

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        Dimension dimension = new Dimension(400,Short.MAX_VALUE);
        Dimension dimension1 = new Dimension(200,Short.MAX_VALUE);
        north.setMaximumSize(dimension1);
        west.setMaximumSize(dimension1);
        center.setMaximumSize(dimension1);
        east.setMaximumSize(dimension);
        south.setMaximumSize(dimension);
        north.setAlignmentX(Component.CENTER_ALIGNMENT);
        west.setAlignmentX(Component.CENTER_ALIGNMENT);
        center.setAlignmentX(Component.CENTER_ALIGNMENT);
        east.setAlignmentX(Component.CENTER_ALIGNMENT);
        south.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(north);
        add(west);
        add(center);
        add(east);
        add(south);
    }

    public static void main(String[] args) {
        BoxLayoutExample box = new BoxLayoutExample();
        box.setSize(500, 500);
        box.setVisible(true);
        box.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}