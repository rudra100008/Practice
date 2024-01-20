package Practice;

import java.awt.*;
import javax.swing.*;

public class Border extends JFrame
{

    Border()
    {


        // creating buttons
        JButton b1 = new JButton("NORTH"); // the button will be labeled as NORTH
        JButton b2 = new JButton("SOUTH"); // the button will be labeled as SOUTH
        JButton b3 = new JButton("EAST"); // the button will be labeled as EAST
        JButton b4 = new JButton("WEST"); // the button will be labeled as WEST
        JButton b5 = new JButton("CENTER"); // the button will be labeled as CENTER

         add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction
        add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction
        add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction
        add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction
        add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center

        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Border();
    }
}