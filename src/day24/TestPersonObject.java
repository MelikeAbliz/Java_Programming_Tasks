package day24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestPersonObject {
    public static void main(String[] args) {
        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};
        people[0].setInfo("Daniel", 'M', LocalDate.of(1970, 2, 25));
        people[1].setInfo("Malik", 'M', LocalDate.of(1967, 5, 5));
        people[2].setInfo("aliye", 'F', LocalDate.of(1963, 8, 14));
        people[3].setInfo("Reyhan", 'F', LocalDate.of(1980, 11, 29));
        people[4].setInfo("Alex", 'M', LocalDate.of(1965, 6, 11));

        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));
        System.out.println(studentsList);
//        print name & date of birth of each person object
        for (Person person : studentsList) {
            System.out.println(person.name + " : " + person.dateOfBirth);
        }

        // remove all the person object that has the age > 55
        studentsList.removeIf(p -> p.age > 55);
        System.out.println(studentsList);
    }
}
/*
 // print name & date of birth of each person object


        // remove all the person object that has the age > 55
 */