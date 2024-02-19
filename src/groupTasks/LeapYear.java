package groupTasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter year: ");
        int year = sc.nextInt();
        boolean result = false;
        String check = " is a leap year";
        if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(year + check + " = " + result);

    }
}
/*
1.Begin
2.Display "Enter a Year"
3.Read the Year
4.If the year is divisible by 4 and not divisible by 100, display Year + " is a leap year"+ "=" +true , Else display Year + " is a leap year"+ "=" +false
5.End
 */
