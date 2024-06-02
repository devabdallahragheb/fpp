package lab4.prob3;

import java.time.LocalDateTime;

public class SoundSensor implements Sensor {
    private HomeLocation location;
    private LocalDateTime lastUpdated;
    private double soundLevel;

    public SoundSensor(HomeLocation location, double soundLevel) {
        this.location = location;
        this.soundLevel = soundLevel;
    }

    @Override
    public String getSensorType() {
        return getClass().getName();
    }

    @Override
    public double getReading() {
        return soundLevel;
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
        return soundLevel > 70 ? "“an alert to turn on noise cancellation" : "Sound is within normal range";
    }
}
