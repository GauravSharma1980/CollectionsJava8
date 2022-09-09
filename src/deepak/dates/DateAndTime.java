package deepak.dates;

//LocalDate
//LocalTime
//LocalDateTime

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTime {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }
}
