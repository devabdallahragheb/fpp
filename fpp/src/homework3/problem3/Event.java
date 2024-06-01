package homework3.problem3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Event {
    private final String name;
    private final ZonedDateTime dateTime;

    public Event(String name, ZonedDateTime dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    // b. Display the day of the week
    public String getDayOfWeek() {
        return dateTime.getDayOfWeek().toString();
    }

    // b. check if it is in a leap year
    public boolean isLeapYear() {
        return dateTime.toLocalDate().isLeapYear();
    }

    // c. Calculate and display the number of days from the current date to the event date.
    public long getRemainingDate() {
        return ChronoUnit.DAYS.between(LocalDate.now(), dateTime.toLocalDate());
    }

    // 2. A Function, nicely format and display the event date and time, including the default system time zone.
    public String getFormatedTime(ZoneId zoneId) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, LLL d, yyyy @ HH:mm ");
        return String.format("%s [%s]",
                dateTime.withZoneSameInstant(zoneId).format(dateTimeFormatter),
                zoneId);
    }
}
