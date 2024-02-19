package day11;

import java.util.Scanner;

public class WebsiteAddress {
    public static void main(String[] args) {
        System.out.println("please enter a website name:");
        String input= new Scanner(System.in).nextLine();
        if (input.startsWith("www.")&&input.endsWith(".com")||input.endsWith(".edu")||input.endsWith(".gov")){
            System.out.println("valid website");
        }else {
            System.out.println("invalid website");
        }


    }
}
/*
write a program that can check if the given website is a valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */