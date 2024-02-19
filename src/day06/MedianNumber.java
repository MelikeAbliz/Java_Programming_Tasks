package day06;

public class MedianNumber {
    public static void main(String[] args) {
       int a=10,
               b=15,
               c=20;
       if((a > b && a < c)||(a > c && a < b)) {
           System.out.println(a + " is median number");
       } else if ((b>a && b<c)||(b>c&& b<a)) {
           System.out.println(b + " is median number");
       }else{
            System.out.println(c+ " is median number. ");
        }
    }
}
/*
Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */