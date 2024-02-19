package replit;

import java.util.Scanner;

public class JavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int javaCount=0;
        int pythonCount=0;
        for (int i = 0; i < sentence.length() - 3; i++) {
            if (sentence.substring(i, (i+4)).equals("java"))
                javaCount ++;
        }
        for (int k = 0; k < sentence.length() - 5; k++) {
            if (sentence.substring(k, (k+6)).equals("python"))
                pythonCount ++;
        }
        if (javaCount==pythonCount){
            System.out.println("true");
        }else System.out.println("false");
    }
}
/*
Use a loop to count how many times the characters java and python
are found in the given String sentence.
 Output true if java and python appear the same number of times,
 otherwise output false.
Ex:
  Input:
    We study java not python
  Output:
    true
  Input:
    What's the difference between java, javascript and python?  java:2  python:1
  Output:
    false

    Input:
   Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented,[15] and specifically designed to have as few implementation dependencies as possible.
  Output:
    true

 */