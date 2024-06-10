package lab6.prog2;

import lab6.prog2.container.StringUtilityPanel;

import javax.swing.*;
import java.awt.*;

public class StringUtilityFrame extends JFrame {
    public void init() {
        this.setTitle("String Utility");
        this.getContentPane().setLayout(new BorderLayout());
        this.setSize(640, 320);
        this.setResizable(false);

        this.setBackground(Color.BLACK);
        this.getContentPane().add(new StringUtilityPanel(), BorderLayout.CENTER);

        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                StringUtilityFrame frame = new StringUtilityFrame();
                frame.init();
            }
        });
    }
}
