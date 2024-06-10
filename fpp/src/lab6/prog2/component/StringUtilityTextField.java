package lab6.prog2.component;

import javax.swing.*;
import java.awt.*;

public class StringUtilityTextField extends JTextField {
    public StringUtilityTextField() {
        this.setAlignmentX(LEFT_ALIGNMENT);
        this.setFont(new Font("Serif", Font.BOLD, 12));
        this.setHorizontalAlignment(LEFT);
        this.setMaximumSize(new Dimension(240, 40));
    }
}
