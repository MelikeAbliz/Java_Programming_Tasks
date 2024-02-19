package day24;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class LocalDateArrayList {
    public static void main(String[] args) {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMM-dd-y");
        ArrayList<LocalDate> dates=new ArrayList<>();
        dates.addAll(Arrays.asList(
                LocalDate.of(2014,8,25),
                LocalDate.of(2019,6,11),
                LocalDate.of(2012,3,9),
                LocalDate.of(2016,9,15),
                LocalDate.of(2015,11,20)));
        LocalDate localdate=LocalDate.of(2016,8,15);
        dates.removeIf(d->d.isBefore(localdate));
//        requirement format: August-15-2016
        LocalDate[] date=dates.toArray(new LocalDate[dates.size()]);
        for (LocalDate localDate : date) {
            System.out.println(localDate.format(df));
        }
    }
}
/*
9. create an Arraylist of LocalDate,
and write a program that can remove all the dates before August-15-2016
 */