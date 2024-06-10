package lab6.prog1.container;

import javax.swing.*;
import java.awt.*;

public class MetricConversionFrame extends JFrame {

    public void init() {

        this.setTitle("Metric Conversion Assistant");
        this.getContentPane().setLayout(new BorderLayout());
        this.setSize(800, 600);
        this.setResizable(false);

        this.setBackground(Color.BLACK);
        this.getContentPane().add(new MetricConversionPanel(), BorderLayout.CENTER);

        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
