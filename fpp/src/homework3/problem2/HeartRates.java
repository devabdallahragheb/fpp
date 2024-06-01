package homework3.problem2;

import java.time.LocalDate;
import java.time.Period;

import java.lang.StringTemplate;

public class HeartRates {
    private static final int RESTING_HEART_RATE = 70;
    private static final int MAX_HEART_RATE = 220;
    private static final double LOWER_BOUNDARY = 0.5;
    private static final double UPPER_BOUNDARY = 0.85;

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // a. Get age
    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(dateOfBirth, today).getYears();
    }

    // b. Get max heart rate
    public double getMaxHeartRate() {
        return MAX_HEART_RATE - this.getAge();
    }

    // c. Print target heart rate range
    public void printTargetHeartRateRange() {
        double averageHeartRate = getMaxHeartRate() - RESTING_HEART_RATE;
        double lowerBoundaryTargetHeartRate = LOWER_BOUNDARY * averageHeartRate + RESTING_HEART_RATE;
        double upperBoundaryTargetHeartRate = UPPER_BOUNDARY * averageHeartRate + RESTING_HEART_RATE;
        System.out.printf("The Target Heart Rate is between %f and %f \n",
                lowerBoundaryTargetHeartRate,
                upperBoundaryTargetHeartRate);
    }

    // d.Override the toString()

    @Override
    public String toString() {
        return StringTemplate.STR."""
                First Name: \{firstName}
                Last Name: \{lastName}
                Age: \{getAge()}
                Date of Birth: \{dateOfBirth}
                Maximum Heart Rate: \{getMaxHeartRate()}
            """.toString();
    }
}