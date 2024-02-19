package day13;

public class Max {
    public static void main(String[] args) {
        System.out.println(max(2.5,7.7));

    }
    public static double max(double num1,double num2){

        if (num1>num2){
            return num1;
        }else return num2;
    }
}
/*
Create a method named max,
that can return the maximum number between two numbers
 */