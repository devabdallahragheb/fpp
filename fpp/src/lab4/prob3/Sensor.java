package lab4.prob3;

import java.time.LocalDateTime;

public interface Sensor {
    String getSensorType();

    double getReading();

    HomeLocation getLocation();

    LocalDateTime getLastUpdated();

    String performAction();
}
