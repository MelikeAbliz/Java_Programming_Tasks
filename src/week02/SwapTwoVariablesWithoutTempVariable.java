package week02;

public class SwapTwoVariablesWithoutTempVariable {
    public static void main(String[] args) {
        int x = 10,
                y = 15;
        x=x+y;//25
        y=x-y;//10
        x=x-y;//15
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
/*
Create a class named SwapTwoVariable21 and declare the following variables:
            a
            b

     Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              a = 10
              b = 15

        output:
                  a = 15
                  b = 20

 */