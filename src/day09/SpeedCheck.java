package day09;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        int speedLimit = 55;
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the current speed: ");
        int currentSpeed=input.nextInt();
        if (currentSpeed>55){
            System.out.println("You're driving 50 mph over the limit. Slow down!");
        }
    }
}
/*
A variable named speedLimit is given
	Ask the user to enter the current speed,
	if the current speed is over the speed limit then print slow down,
	otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!

 */