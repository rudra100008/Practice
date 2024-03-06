package com.PracticeNetwork;
import javax.swing.*;
import java.awt.*;

public class BarChart extends JPanel {
    private int[] values;
    private String[] labels;
    private Color[] colors;

    public BarChart(int[] values, String[] labels, Color[] colors) {
        this.values = values;
        this.labels = labels;
        this.colors = colors;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int startX = 50;
        int startY = 300;
        int barWidth = 50;
        int barSpacing = 20;

        for (int i = 0; i < values.length; i++) {
            int barHeight = values[i];
            int x = startX + i * (barWidth + barSpacing);
            int y = startY - barHeight;
            g.setColor(colors[i]);
            g.fillRect(x, y, barWidth, barHeight);
            g.setColor(Color.BLACK);
            g.drawString(labels[i], x + barWidth / 2 - 5, startY + 15);
            g.drawString(String.valueOf(values[i]), x + barWidth / 2 - 5, y - 5);
        }
    }

    public static void main(String[] args) {
        int[] values = {50, 100, 150, 200};
        String[] labels = {"A", "B", "C", "D"};
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.ORANGE};

        JFrame frame = new JFrame("Bar Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BarChart(values, labels, colors));
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
