package day14;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome());
//        palindrome("Anna");
//        palindrome("melike");
    }
    public static boolean palindrome(){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter string: ");
        String str=input.next();
        String reverse="";
        for (int i = str.length()-1 ;i>=0; i--) {
            char each=str.charAt(i);
            reverse+=each;
        }
        if (str.toLowerCase().equals(reverse.toLowerCase())){
            return true;
        }else return false;
    }
}
/*
Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true

 */