package lab6.prog2.container;

import lab6.prog2.StringUtils;
import lab6.prog2.component.StringUtilityTextField;

import javax.swing.*;
import java.awt.*;

public class DataPanel extends JPanel {

    private StringUtilityTextField textFieldInput;
    private StringUtilityTextField textFieldOutput;

    public DataPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        initComponents();
    }

    private void initComponents() {
        JLabel labelInput = new JLabel("Input");
        JLabel labelOutput = new JLabel("Output");
        textFieldInput = new StringUtilityTextField();
        textFieldOutput = new StringUtilityTextField();
        add(labelInput);
        add(textFieldInput);
        add(labelOutput);
        add(textFieldOutput);
    }

    public void performReverse() {
        textFieldOutput.setText(StringUtils.reverse(textFieldInput.getText()));
    }

    public void performCount() {
        textFieldOutput.setText(StringUtils.count(textFieldInput.getText()));
    }

    public void performRemoveDuplicates() {
        textFieldOutput.setText(StringUtils.removeDuplicates(textFieldInput.getText()));
    }
}
