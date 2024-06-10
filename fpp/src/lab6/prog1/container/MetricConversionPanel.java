package lab6.prog1.container;

import lab6.prog1.component.MetricLabel;
import lab6.prog1.component.MetricTextField;

import javax.swing.*;
import java.awt.*;

public class MetricConversionPanel extends JPanel {

    private MetricTextField textField;
    private MetricLabel label;

    public MetricConversionPanel() {
        this.setLayout(new BorderLayout(20, 20));
        this.setSize(500, 50);
        initComponent();
        addComponents();
    }

    public void initComponent() {

        label = new MetricLabel();
        label.setSize(300, 20);
        label.setText("Weight");
        textField = new MetricTextField();
        textField.setPreferredSize(new Dimension(300, 20));
    }

    public void addComponents() {
        this.add(textField, BorderLayout.EAST);
        this.add(label, BorderLayout.WEST);
    }

}
