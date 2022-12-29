package Telusko_Java_tutorials;

import java.time.*;

public class DateTimeApiDemo {
    public static void main(String[] args) {
        //LocalDate d = LocalDate.now();
        //LocalDate d = LocalDate.of(1989, Month.FEBRUARY,29);
        //System.out.println(d);

        //LocalTime t=LocalTime.now();
        //LocalTime t1=LocalTime.of(12,35,10,999);
        LocalTime t2=LocalTime.now(ZoneId.of("GMT"));
        System.out.println(t2);

        LocalDateTime lt=LocalDateTime.now();
        System.out.println(lt);
    }
}
