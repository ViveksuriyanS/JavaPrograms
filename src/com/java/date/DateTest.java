package com.java.date;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTest {

    public static void main(String[] args) {
        // Immutable class that represents date in yyyy/mm/dd format
        LocalDate date = LocalDate.now(); // Give the current date
        System.out.println(date);
        System.out.println(date.isLeapYear());

        LocalDateTime dateTime = LocalDateTime.now(); // Date with TimeStamp
        System.out.println(dateTime);

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        ZoneId zone = ZoneId.of("Asia/Tokyo");
        LocalTime time2 = LocalTime.now(zone);
        System.out.println(time2);

        // Difference between Time
        long hours = ChronoUnit.HOURS.between(time1, time2);
        System.out.println(hours);
        long minutes = ChronoUnit.MINUTES.between(time1, time2);
        System.out.println(minutes);

        System.out.println(Clock.systemDefaultZone());

    }

}

// LocalDate is a final class (value cannot be changed)
// LocalDateTime