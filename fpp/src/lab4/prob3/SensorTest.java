package lab4.prob3;

import java.time.format.DateTimeFormatter;

public class SensorTest {
    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[5];
        sensors[0] = new LightSensor(HomeLocation.BedRoom, 20);
        sensors[1] = new SoundSensor(HomeLocation.Garage, 35.5);
        sensors[2] = new TemparatureSensor(HomeLocation.LivingRoom, 50.8);
        sensors[3] = new LightSensor(HomeLocation.Kitchen, 10);
        sensors[4] = new TemparatureSensor(HomeLocation.Garden, 17.3);

        for (Sensor sensor : sensors) {
            if (sensor != null) {
                System.out.println(STR."""
                        Sensor Type: \{sensor.getSensorType()}
                        Reading: \{sensor.getReading()}
                        Location: \{sensor.getLocation()}
                        Last Updated: \{sensor.getLastUpdated().format(DateTimeFormatter.ofPattern("hh:mm a"))}
                        Action: \{sensor.performAction()}
                        """);
            }
        }
    }
}
