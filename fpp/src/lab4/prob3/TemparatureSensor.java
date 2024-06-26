package lab4.prob3;

import java.time.LocalDateTime;

public class TemparatureSensor implements Sensor {
    private final HomeLocation location;
    private LocalDateTime lastUpdated;
    private final double temperature;

    public TemparatureSensor(HomeLocation location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    @Override
    public String getSensorType() {
        return "Temperature";
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
    public HomeLocation getLocation() {
        return location;
    }

    @Override
    public LocalDateTime getLastUpdated() {
        lastUpdated = LocalDateTime.now();
        return lastUpdated;
    }

    @Override
    public String performAction() {
        return temperature > 30 ? "Turn on the AC!" : "Turn on the Heater!";
    }
}
