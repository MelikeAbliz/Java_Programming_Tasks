package day07;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 190;

        String result = "";

        if (age >= 10 && age <= 150) {
            if (age >= 10 && age < 21) {                  //Teenager (< 21)
                result = "Teenager";
            } else if (age >= 21 && age < 55) {             //Adult   (>=21 && <55 )
                result = "Adult";
            } else if (age > 55 && age <= 150) {             //Senior  ( > 55 )
                result = "Senior";
            }
        } else {                                  //if the age is negative or greater than 150, print "invalid"
            result = "invalid";
        }

        System.out.println(result);
    }
}
/*
 write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if the age is negative or greater than 150, print "invalid"

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */