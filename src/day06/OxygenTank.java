package day06;

public class OxygenTank {
    public static void main(String[] args) {
        int level = 110;
        String result = "";
        if (level <= 100 && level >= 50) {
            if (level >= 90) {
                result = "Your tank is full";
            }
            if (level >= 80 && level < 90) {
                result = "Still okay";
            }
            if (level >= 70 && level < 80) {
                result = "Don't go too far";
            }
            if (level >= 60 && level < 70) {
                result = "Start to head back";
            }
            if (level >= 50 && level < 60) {
                result = "Be careful now you at at 50%";
            }
        } else {
            result = "invalid number";
        }
        System.out.println(result);
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

 */