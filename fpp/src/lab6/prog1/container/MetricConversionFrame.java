package lab6.prog1.container;

import lab6.prog1.component.MetricTextField;

import javax.swing.*;
import java.awt.*;

public class MetricConversionFrame extends JFrame {
    public void init() {
        this.setTitle("Metric Conversion");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().add(new MetricConversionPanel());
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MetricConversionFrame frame = new MetricConversionFrame();
                frame.init();
            }
        });
    }
}
