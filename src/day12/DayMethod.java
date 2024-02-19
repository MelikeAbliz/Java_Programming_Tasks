package day12;

public class DayMethod {
    public static void main(String[] args) {
        day(3);
    }
    public static void day(int day){
        String result=(day>=1&&day<=7)?(day==1)?"Monday":(day==2)?"Tuesday"
                :(day==3)?"Wednesday":(day==4)?"Thursday":(day==5)?"Friday":(day==6)?"Saturday"
                :"Sunday":"Invalid number";
        System.out.println(result);
    }
}
/*
Create a method named day that can display the name of the day
based on the given number to the method, if the number is invalid,
then the method should print the error message "Invalid Number55"
    Ex:
        day(5)

        output:
            Friday

 */