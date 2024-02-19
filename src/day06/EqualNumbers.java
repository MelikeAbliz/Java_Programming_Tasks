package day06;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter number n1: ");
        double n1= scanner.nextDouble();

        System.out.println("please enter number n2: ");
        double n2= scanner.nextDouble();

        System.out.println("please enter number n3: ");
        double n3=scanner.nextDouble();
        String result="";
        if (n1==n2 && n1==n3 && n2==n3){
            result="all equal";
        }if (n1==n2 && !(n1==n3 && n2==n3)){
            result="n1&n2 are equal";
        }if (n2==n3 && !(n1==n2 && n1==n3)){
        result="n2&n3 are equal";
        }if (n1==n3&& !(n1==n2 && n2==n3)){
            result="n3&n1 are equal";
        }if (!(n1==n2 || n1==n3 || n2==n3)){
            result="none of them are equal";
        }
        System.out.println(result);

    }
}
/*
 write a program that can check the equality of the three given numbers
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are equal ==> none of them are equal

 */