package day12;

import java.util.Scanner;

public class EmailDomain {
    public static void main(String[] args) {
        emailDomain("cydeo@gmail.com");
    }
    public static void emailDomain(String emailName){
        String  domain=emailName.substring(emailName.indexOf("@")+1,emailName.indexOf("."));
        System.out.println("domain: "+domain);
    }
}
/*
 Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail


 */