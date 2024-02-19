package day16;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String anwser = "yes";
        do {
            System.out.println("Enter your score");
            int score=input.nextInt();
            while (score<0 || score>100){
                System.err.println("Invalid Entry");
                System.exit(1);
            }
            String result=(score>=90 && score<100)?"A":(score>=80 &&score<90)?"B"
                    :(score>=70 && score<80)?"C":(score>=60 && score<70)?"D":"F";
            System.out.println(result);
            System.out.println("Would you like to continue? YES/NO");
            anwser = input.next().toLowerCase();
            while (!(anwser.equals("yes") || anwser.equals("no"))) {
                System.err.println("Invalid anwser!! please re-enter");
                System.err.println("Would you like to continue? YES/NO");
                anwser = input.next().toLowerCase();
            }
            if (anwser.equals("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
            }
        }while (anwser.equals("yes"));
        input.close();
    }
}
/*
Write a program for the grade calculator:
                        1. Ask the user to "Enter your score"
                                If user enters an invalid score, terminate the program after
                                displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If the user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program
 */