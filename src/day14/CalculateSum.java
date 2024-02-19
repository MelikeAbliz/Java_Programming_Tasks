package day14;

public class CalculateSum {
    public static void main(String[] args) {
        System.out.println(sumOfAll(50));
    }
    public static int sumOfAll(int num){
        int sum=0;
        for (int i=0;i<=num;i++){
            sum+=i;
        }return sum;
    }
}
/*
write a program that can calculate the sum of all numbers
between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */