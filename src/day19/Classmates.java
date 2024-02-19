package day19;

import java.util.Arrays;

public class Classmates {
    public static void main(String[] args) {
        String[] classmates = {"asiye yashar", "muhtar mehmut", "reyhan eli", "alix art", "mak salam", "dilxat rosul",
                "ali geni", "mihri gulam", "ayse quddus","isak hadi"};
        System.out.println(classmates.length);
        for (int i = 0; i < classmates.length; i++) {
            String classmate=classmates[i];
            System.out.println(classmate);
        }
//        for (int i = 0; i < classmates.length; i++) {
//            String each=classmates[i].charAt(0)+"."+classmates[i].charAt(classmates[i].lastIndexOf(" ")+1);
//            System.out.print(each.toUpperCase()+" / ");
//        }
    }
}
/*
create an array of named classmates, and store 10 of your classmates' full names
            print the initials of each classmate in separate lines

 */