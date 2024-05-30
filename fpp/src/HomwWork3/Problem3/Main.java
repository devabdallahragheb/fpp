package HomwWork3.Problem3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter Event Name: "  );
        String eventName=scan.next();
        System.out.println("please enter date : "  );
        String eventDateStr=scan.next();
        System.out.println("please enter Event Time: "  );
        String eventTimeStr=scan.next();
        System.out.println("please enter  Time Zone : "  );
        String timeZone=scan.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate eventDate = LocalDate.parse(eventDateStr, formatter);
        LocalTime time = LocalTime.parse(eventTimeStr, java.time.format.DateTimeFormatter.ofPattern("HH:mm"));
        Event event = new Event(eventName, time);
        event.displayEventDayAndCheckisLeapYear(eventDate);
        event.formatDateTimeAndConvertZone(eventDate,time,timeZone);
    }
}
