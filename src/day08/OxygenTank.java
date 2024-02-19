package day08;

public class OxygenTank {
    public static void main(String[] args) {
        int level=60;
        String message=(level<=150&&level>=50)?(level<60)?"Be careful now you at 50%"
                :(level<70)?"Start to head back":(level<80)?"Don't go too far"
                :(level<90)?"Still okay" :"Your tank is full"
                :"please enter valid level number";
        System.out.println(message);
    }
}
/*
 You are diving in the ocean. Your oxygen tank has a certain level (number) and
  you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary
 */