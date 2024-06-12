package lab6.prog1.component;

import javax.swing.*;
import java.awt.*;

public class MetricConversionLabel extends JLabel {
    public MetricConversionLabel(String label) {
        this.setText(label);
        this.setFont(new Font("Serif", Font.BOLD, 16));
        this.setPreferredSize(new Dimension(120, 30));
    }
}
