package homework3.problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Please, enter first name: ");
        String firstName = sc.nextLine();
        System.out.println("Please, enter last name: ");
        String lastName = sc.nextLine();
        while (true) {
            System.out.println("Please, enter your bith date in the format-(yyyy-MM-dd)-Example: 1989-04-14 ");
            String dob = sc.nextLine();
            try {
                LocalDate birthday = LocalDate.parse(dob, formatter);
                HeartRates heartRates = new HeartRates(firstName, lastName, birthday);
                heartRates.printTargetHeartRateRange();
                System.out.println(heartRates);
                break;
            } catch(DateTimeParseException dateTimeParseException) {
                System.out.println(dateTimeParseException.getMessage());
            }
        }
    }
}