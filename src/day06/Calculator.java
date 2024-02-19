package day06;

public class Calculator {
    public static void main(String[] args) {
        int n1=10;
        int n2=20;
        char mathOperator ='-';
        if (mathOperator=='+'){
            System.out.println(n1+n2);
        }if (mathOperator=='-'){
            System.out.println(n1-n2);
        }if (mathOperator=='*'){
            System.out.println(n1*n2);
        }if (mathOperator=='/'){
            System.out.println(n1/n2);
        }if (mathOperator=='%'){
            System.out.println(n1%n2);
        }
    }
}
