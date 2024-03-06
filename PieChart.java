package com.PracticeNetwork;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class PieChart extends JPanel {
    private double[] values;
    private String[] labels;
    private Color[] colors;

    public PieChart(double[] values, String[] labels, Color[] colors) {
        this.values = values;
        this.labels = labels;
        this.colors = colors;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();
        int diameter = Math.min(width, height) * 2 / 3;
        int cx = (width - diameter) / 2;
        int cy = (height - diameter) / 2;
        double total = 0;

        for (double value : values) {
            total += value;
        }

        double startAngle = 0;
        for (int i = 0; i < values.length; i++) {
            double extent = 360 * (values[i] / total);
            g2d.setColor(colors[i]);
            g2d.fill(new Arc2D.Double(cx, cy, diameter, diameter, startAngle, extent, Arc2D.PIE));

            // Draw value label inside the segment
            int labelX = (int) (cx + diameter * 0.5);
            int labelY = (int) (cy + diameter * 0.5);
            g2d.setColor(Color.BLACK);
            g2d.drawString(String.format("%.1f%%", (values[i] / total) * 100), labelX, labelY);

            startAngle += extent;
        }

        // Draw legend
        int legendX = cx + diameter+20;
        int legendY = cy + 20;
        for (int i = 0; i < labels.length; i++) {
            g2d.setColor(colors[i]);
            g2d.fillRect(legendX, legendY + i * 25, 20, 20);
            g2d.setColor(Color.BLACK);
            g2d.drawString(labels[i], legendX + 30, legendY + 15 + i * 25);
        }
    }

    public static void main(String[] args) {
        double[] values = {30, 40, 20, 10};
        String[] labels = {"A", "B", "C", "D"};
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.ORANGE};

        JFrame frame = new JFrame("Pie Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new PieChart(values, labels, colors));
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
