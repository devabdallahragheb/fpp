package lab6.prog2.component;

import javax.swing.*;
import java.awt.*;

public class StringUtilityButton extends JButton {
    public StringUtilityButton(String title) {
        this.setText(title);
        this.setFont(new Font("Serif", Font.BOLD, 16));
        this.setHorizontalAlignment(LEFT);
        this.setMaximumSize(new Dimension(180, 48));
        this.setAlignmentX(Component.RIGHT_ALIGNMENT);
    }
}
