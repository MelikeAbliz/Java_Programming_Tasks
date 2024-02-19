package day13;

public class IsEven {
    public static void main(String[] args) {
        System.out.println(isEven(14));
    }
    public static boolean isEven(int num){
        return !IsOdd.isOdd(num);
    }
}
/*
Create a method named isEven,
that can return true if a number is an even number, otherwise returns false
 */