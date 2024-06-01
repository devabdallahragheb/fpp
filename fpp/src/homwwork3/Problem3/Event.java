package homwwork3.Problem3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;

public class Event {
    private String eventName;
    private LocalTime eventDateTime;

    public Event(String eventName, LocalTime eventDateTime) {
        this.eventName = eventName;
        this.eventDateTime = eventDateTime;
    }

    public void displayEventDayAndCheckisLeapYear(LocalDate date){
        System.out.println("Leap Year: " + date.isLeapYear());
        System.out.println("Event Date: " + date.getDayOfWeek().getDisplayName(TextStyle.FULL, java.util.Locale.getDefault()));
        System.out.println("the number of days from the current date to the event date"+getDaysBetweenDates(date,LocalDate.now()));
    }
    public static long getDaysBetweenDates(LocalDate start, LocalDate end) {
        Duration duration = Duration.between(start.atStartOfDay(), end.atStartOfDay());
        return duration.toDays();
    }

    public static void   formatDateTimeAndConvertZone(LocalDate date, LocalTime time, String timeZone) {
        ZonedDateTime systemDateTime = ZonedDateTime.of(date, time, ZoneId.systemDefault());
        // Convert  time zone
        ZonedDateTime dateTime = systemDateTime.withZoneSameInstant(ZoneId.of(timeZone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy @ HH:mm [VV]");
        System.out.println(dateTime.format(formatter));
    }


}
