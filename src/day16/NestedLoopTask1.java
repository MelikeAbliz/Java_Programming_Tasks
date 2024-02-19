package day16;

public class NestedLoopTask1 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------");

        for (int i = 10; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("-------------------------------------");
        for (int row = 0; row <=5; row++) {
            for (int col = 0; col <=6 ; col++) {
                if ((row == 0 && row % 3 != 0) || (row==1)&& (col%3==0)|| (row-col==2)||(row+col==8)) {
                    System.out.print("$ ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");

        }

    }


}
/*
Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */