package day07;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size1="tall";
        String size2="grande";
        String size3="venti";
        String validSize="grande677";
        if (validSize==size1||validSize==size2||validSize==size3){
            if (validSize==size1){
                System.out.println("price is $3.69 and 90 calories");
            }else if (validSize==size2){
                System.out.println("price is $3.99 and 120 calories");
            }else if (validSize==size3){
                System.out.println("price is $4.29 and 150 calories");
            }

        }else {
            System.out.println("invalid size");
        }


    }
}
/*
A variable named Size is given, write a program that can display the price and
calories of cappuccino Valid sizes are tall, grande, and venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if

 */