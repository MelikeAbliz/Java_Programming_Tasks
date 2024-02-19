package day24;

import java.time.LocalDate;

public class LeapYearFunction {
    public static void main(String[] args) {
        LocalDate birthday=LocalDate.ofYearDay(2001,25);
        boolean isLeapYear= birthday.isLeapYear();
        System.out.println(birthday.getYear()+" isLeapYear = " + isLeapYear);
    }
}
/*
8. Create a function that accepts an int argument birthYear,
return true if the person was born on leap year, otherwise return false
 */