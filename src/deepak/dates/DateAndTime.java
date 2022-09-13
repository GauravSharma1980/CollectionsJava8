package deepak.dates;

//LocalDate
//LocalTime
//LocalDateTime

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);


        localDate = localDate.plusDays(-2);
        System.out.println(localDate);

        localDate = localDate.plusMonths(100);
        System.out.println(localDate);

       //calculateDate();
    }

    /*public static LocalDate calculateDate() {

        int day = 12;
        int year = 2022;
        int month = 9;
        switch (9) {
            case 2 -> day = Math.min(day, IsoChronology.INSTANCE.isLeapYear(year) ? 29 : 28);
            case 4, 6, 9, 11 -> day = Math.min(day, 30);
        }
        return new LocalDate(year, month, day);
    }*/
}
