package lab6.prog1.component;

import javax.swing.*;
import java.awt.*;

public class MetricConversionButton extends JButton {
    public MetricConversionButton(String text) {
        this.setText(text);
        this.setFont(new Font("Serif", Font.BOLD, 16));
        this.setPreferredSize(new Dimension(120, 48));
    }
}
