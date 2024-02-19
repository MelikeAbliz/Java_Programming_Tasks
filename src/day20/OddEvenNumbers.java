package day20;

public class OddEvenNumbers {
    public static void main(String[] args) {
        int[] array={2,3,4,5,43,22,66,88,97};
        int oddNumber=0;
        int evenNumber=0;
        for (int i : array) {
            if (i%2==0){
                evenNumber++;
            }else oddNumber++;
        }
        System.out.println("the array have "+evenNumber+" even number and "+oddNumber+" odd number");
    }
}
/*
 Write a program that can count the even and odd numbers from an array of integers

			Note: MUST use for each loop

 */