package day12;

import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {

        capitalization("cYDEo","sCHOOl");

    }
    public static void capitalization(String firstName,String lastName){
        firstName=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=(""+lastName.charAt(0)).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(firstName+" "+lastName);
    }
}
/*
Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School

 */