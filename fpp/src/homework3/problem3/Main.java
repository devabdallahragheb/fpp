package homework3.problem3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.zone.ZoneRulesException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.print("Please, enter the event name: ");
        String name = scanner.nextLine();
        LocalDate localDate;
        LocalTime localTime;
        while (true) {
            System.out.print("Please, enter the event date in the format (yyyy-MM-dd)- Example: 2024-12-31: ");
            String date = scanner.nextLine();
            System.out.print("Please, enter the event time in the format (hh:mm)- Example: 20:30:  ");
            String time = scanner.nextLine();
            try {
                localDate = LocalDate.parse(date, dateFormatter);
                localTime = LocalTime.parse(time, timeFormatter);
                Event event = new Event(name, ZonedDateTime.of(localDate, localTime, ZoneId.systemDefault()));
                System.out.printf("Day of week for the event %s is %s \n",
                        event.getName(),
                        event.getDayOfWeek());
                System.out.printf("Even %s leap year \n", event.isLeapYear() ? "is" : "is not");
                System.out.printf("From today to date of event is %d day(s) left \n",
                        event.getRemainingDate());
                System.out.printf("Event detail is %s: \n",
                        event.getFormatedTime(ZoneId.systemDefault()));
                System.out.print("Please, enter valid timezone id to convert: ");
                String timeZone = scanner.nextLine();
                System.out.printf("Event detail in timezone %s is %s: \n",
                        timeZone,
                        event.getFormatedTime(ZoneId.of(timeZone)));
                break;
            } catch(DateTimeParseException | ZoneRulesException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
