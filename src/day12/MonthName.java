package day12;

public class MonthName {
    public static void main(String[] args) {
        monthName(5);

    }
    public static void monthName(int month){

        String result=(month>=1&&month<=12)?(month==1)?"January":(month==2)?"Februray"
                :(month==3)?"March":(month==4)?"April":(month==5)?"May":(month==6)?"June"
                :(month==7)?"July":(month==8)?"August":(month==9)?"September":(month==10)?"Octaber"
                :(month==11)?"November":"December":"invalid number";
        System.out.println(result);

    }
}
/*
Create a method named monthName that can display the name of the month based on
 the given number to the method, if the number is invalid, then the method should
 print the error message "Invalid Number55"
    Ex:
        monthName(6)

        output:
          June
 */