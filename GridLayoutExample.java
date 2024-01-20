package Practice;


import java.awt.*;
import javax.swing.*;

    public class GridLayoutExample extends JFrame
    {
        // constructor
        GridLayoutExample()
        {


// creating 9 buttons
            JButton btn1 = new JButton("1");
            JButton btn2 = new JButton("2");
            JButton btn3 = new JButton("3");
            JButton btn4 = new JButton("4");
            JButton btn5 = new JButton("5");
            JButton btn6 = new JButton("6");
            JButton btn7 = new JButton("7");
            JButton btn8 = new JButton("8");
            JButton btn9 = new JButton("9");


            add(btn1); add(btn2); add(btn3);
            add(btn4); add(btn5); add(btn6);
            add(btn7); add(btn8); add(btn9);

// setting the grid layout using the parameterless constructor
            setLayout(new GridLayout(3,3,100,100));


            setSize(1000, 1000);
            setVisible(true);
        }

        // main method
        public static void main(String[] args)
        {
            new GridLayoutExample();
        }
    }
