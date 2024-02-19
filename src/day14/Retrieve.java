package day14;

public class Retrieve {
    public static void main(String[] args) {
        retrieve("mn@#123Ab!");
    }
    public static void retrieve(String str){
       String letters="";
       String num="";
       String speacial="";
        for (char i=0;i<str.length();i++){
            boolean isLetters=(str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='a' && str.charAt(i)<='z');
            boolean isDigits=str.charAt(i)>='0' && str.charAt(i)<='9';
            if (isLetters){
                letters+=str.charAt(i);

            }else if (isDigits) {
                num+=str.charAt(i);
            }
            else {
               speacial+=str.charAt(i);
            }
        }
        System.out.println("letters: "+letters);
        System.out.println("digits: "+num);
        System.out.print("special chars: "+speacial);
    }
}
/*
write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */