package day24;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        LocalDate birthday=LocalDate.of(1999,2,25);

        System.out.println(today);
        System.out.println(birthday);
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
    }
}
