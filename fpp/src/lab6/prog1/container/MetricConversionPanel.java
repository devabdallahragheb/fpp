package lab6.prog1.container;

import lab6.prog1.MetricConversionType;
import lab6.prog1.component.MetricConversionButton;
import lab6.prog1.component.MetricConversionRow;

import javax.swing.*;
import java.awt.*;

public class MetricConversionPanel extends JPanel {

    private MetricConversionButton btnConvert;
    private MetricConversionRow metricConversionRowWeight;
    private MetricConversionRow metricConversionRowDistance;
    private MetricConversionRow metricConversionRowLiquidCapacity;
    private MetricConversionRow metricConversionRowTemperature;

    public MetricConversionPanel() {
        initComponent();
        addListener();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(Box.createRigidArea(new Dimension(0, 48)));
        this.add(metricConversionRowDistance);
        this.add(Box.createRigidArea(new Dimension(0, 24)));
        this.add(metricConversionRowWeight);
        this.add(Box.createRigidArea(new Dimension(0, 24)));
        this.add(metricConversionRowLiquidCapacity);
        this.add(Box.createRigidArea(new Dimension(0, 24)));
        this.add(metricConversionRowTemperature);
        this.add(Box.createRigidArea(new Dimension(0, 56)));
        JPanel panelButton = new JPanel();
        this.add(Box.createRigidArea(new Dimension(0, 24)));
        panelButton.add(btnConvert, BorderLayout.CENTER);
        this.add(panelButton);
    }

    private void initComponent() {
        btnConvert = new MetricConversionButton("Convert");
        metricConversionRowDistance = new MetricConversionRow("Mile:", "Kilometer:", MetricConversionType.DISTANCE);
        metricConversionRowWeight = new MetricConversionRow("Pound:", "Kilogram:", MetricConversionType.WEIGHT);
        metricConversionRowLiquidCapacity = new MetricConversionRow("Gallon:", "Liters:", MetricConversionType.LIQUID_CAPACITY);
        metricConversionRowTemperature = new MetricConversionRow("Fahrenheit:", "Centigrade:", MetricConversionType.TEMPERATURE);
    }

    private void addListener() {
        btnConvert.addActionListener(e -> {
            metricConversionRowWeight.performConversion();
            metricConversionRowDistance.performConversion();
            metricConversionRowLiquidCapacity.performConversion();
            metricConversionRowTemperature.performConversion();
        });
    }
}
