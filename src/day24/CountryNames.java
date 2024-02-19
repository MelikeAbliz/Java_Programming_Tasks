package day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountryNames {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList("Istanbul","Adana","Izmir","Kocaali","SultanAhmat","BeyazitCity"));
        ArrayList<String> countryNames = new ArrayList<>();
        for (String s : arrList) {
            if (s.length()>=10){
                continue;
            }
            countryNames.add(s);
        }
        arrList.removeIf(p->p.length()>10);
        System.out.println(arrList);
        System.out.println("countryNames = " + countryNames);
    }
}
/*
6. Create an ArrayList of strings called country names, 
and write a program that can remove all the country names that have lengths of 10 or greater
 */