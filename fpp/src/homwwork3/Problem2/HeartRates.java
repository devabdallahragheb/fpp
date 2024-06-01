package homwwork3.Problem2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    private static final int RESTING_HEART_RATE = 70;
    private static final int MAX_HEART_RATE = 220;
    private static final double LOWER_BOUNDARY = 0.5;
    private static final double UPPER_BOUNDARY = 0.85;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAgeYear() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public int calculateMaxHeartRate() {
        return MAX_HEART_RATE - calculateAgeYear();
    }

    public void printTargetHeartRateRange() {
        int averageHeartRate = calculateMaxHeartRate() - RESTING_HEART_RATE;
        int lowerBoundaryTargetHeartRate = (int) (averageHeartRate * LOWER_BOUNDARY + RESTING_HEART_RATE);
        int upperBoundaryTargetHeartRate = (int) (averageHeartRate * UPPER_BOUNDARY + RESTING_HEART_RATE);
        System.out.printf("Target Heart Rate Range: %d and %d bpm\n", lowerBoundaryTargetHeartRate, upperBoundaryTargetHeartRate);
        System.out.println("First Name "+this.firstName);
        System.out.println("Last Name "+this.lastName);
        System.out.println("Age "+this.calculateAgeYear());
        System.out.println("Maximum Heart Rate "+this.calculateMaxHeartRate());

    }

    @Override
    public String toString() {
        int age = calculateAgeYear();
        int maxHeartRate = calculateMaxHeartRate();
        return String.format("%s %s (%s), %d years old, Max Heart Rate: %d bpm", firstName, lastName, dateOfBirth.toString(), age, maxHeartRate);
    }


}