package lab6.prog1.component;

import lab6.prog1.MetricConversionType;

import javax.swing.*;
import java.awt.*;

public class MetricConversionRow extends JPanel {

    private MetricConversionTextField textFieldLeft;
    private MetricConversionTextField textFieldRight;
    private MetricConversionLabel labelLeft;
    private MetricConversionLabel labelRight;
    private MetricConversionType metricConversionType;

    private double DISTANCE_RATE = 1.60934;
    private double WEIGHT_RATE = 0.453592;
    private double LIQUID_CAPACITY_RATE = 3.78541;

    public MetricConversionRow(String leftLabel, String rightLabel, MetricConversionType metricConversionType) {
        this.metricConversionType = metricConversionType;
        textFieldLeft = new MetricConversionTextField();
        textFieldRight = new MetricConversionTextField();
        labelLeft = new MetricConversionLabel(leftLabel);
        labelRight = new MetricConversionLabel(rightLabel);
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.add(Box.createRigidArea(new Dimension(40, 0)));
        this.add(labelLeft);
        this.add(textFieldLeft);
        this.add(Box.createRigidArea(new Dimension(40, 0)));
        this.add(labelRight);
        this.add(textFieldRight);
        this.add(Box.createRigidArea(new Dimension(40, 0)));
    }

    public void performConversion() {
        String leftValue = textFieldLeft.getText();
        String rightValue = textFieldRight.getText();
        switch (metricConversionType) {
            case WEIGHT:
                if (isValidInput(leftValue)) {
                    textFieldRight.setText(String.format("%.2f", (parseNumber(leftValue) * WEIGHT_RATE)));
                } else if (isValidInput(rightValue)) {
                    textFieldLeft.setText(String.format("%.2f", (parseNumber(rightValue) / WEIGHT_RATE)));
                }
                break;
            case DISTANCE:
                if (isValidInput(leftValue)) {
                    textFieldRight.setText(String.format("%.2f", (parseNumber(leftValue) * DISTANCE_RATE)));
                } else if (isValidInput(rightValue)) {
                    textFieldLeft.setText(String.format("%.2f", (parseNumber(rightValue) / DISTANCE_RATE)));
                }
                break;
            case TEMPERATURE:
                if (isValidInput(leftValue)) {
                    textFieldRight.setText(String.format("%.2f", convertFahrenheitToCelsius(parseNumber(leftValue))));
                } else if (isValidInput(rightValue)) {
                    textFieldLeft.setText(String.format("%.2f", convertCelsiusToFahrenheit(parseNumber(rightValue))));
                }
                break;
            case LIQUID_CAPACITY:
                if (isValidInput(leftValue)) {
                    textFieldRight.setText(String.format("%.2f", (parseNumber(leftValue) * LIQUID_CAPACITY_RATE)));
                } else if (isValidInput(rightValue)) {
                    textFieldLeft.setText(String.format("%.2f", (parseNumber(rightValue) / LIQUID_CAPACITY_RATE)));
                }
                break;
        }
    }

    private double parseNumber(String input) {
        return Double.parseDouble(input);
    }

    private boolean isValidInput(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
