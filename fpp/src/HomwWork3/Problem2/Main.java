package HomwWork3.Problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please, enter the first name :");
        String firstName = sc.next();
        System.out.println("please, enter the last name :");
        String lastName = sc.next();
        System.out.println("please, enter your birth date int the format -(yyyy-mm-dd) example 1898-4-14");
        String dateOfBirthStr = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr, formatter);

        HeartRates heartRates = new HeartRates(firstName, lastName, dateOfBirth);



        heartRates.printTargetHeartRateRange();
    }
}