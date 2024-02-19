package week04;

import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        String pinNumber = "0123";  // has the correct pin number
        double accountBalance = 5000; // current available balance

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your pin number:");
        String userEnteredPinNumber = input.next();

        if(!userEnteredPinNumber.equals(pinNumber)){  // if the user entered PIN number is incorrect
            System.err.println("Incorrect pin number, please try again later.");
            System.exit(1); // Terminates the entire program
        }

        System.out.println("Select one of the three followings:\n\t1. Check Balance\n\t2. Deposit Money\n\t3. Withdraw Money");
        int option = input.nextInt();
        switch (option){
            case 1: // check balance
                System.out.println("Your available balance is: $" + accountBalance);
                break;

            case 2: // deposit
                System.out.println("How much would you like to deposit?");
                double depositAmount = input.nextDouble();
                if(depositAmount <= 0){ // if the depositing amount is zero or negative
                    System.err.println("Depositing amount cannot be zero or negative, please try again later.");
                    System.exit(1);
                }else{ // if the depositing amount is greater than zero
                    accountBalance += depositAmount;
                    System.out.println("Depositing $"+depositAmount +" ...\nYour new available balance is $" +accountBalance);
                }
                break;

            case 3: // withdraw
                System.out.println("How much would you like to withdraw?");
                double withdrawAmount = input.nextDouble();
                if( withdrawAmount <= 0 ){ // if the withdrawing amount is zero or negative
                    System.err.println("Cannot withdraw zero or negative amount, please try again later.");
                    System.exit(1);
                }else if(withdrawAmount > accountBalance){ // if the withdrawing amount is greater than the available balance
                    System.err.println("Insufficient funds. Withdrawal failed.");
                    System.exit(1);
                }else { //if the withdrawing amount is greater than 0 but less than available balance
                    accountBalance -= withdrawAmount;
                    System.out.println("withdrawing $" + withdrawAmount + " ...\nYour new available balance is $" + accountBalance);
                }
                break;

            default: // invalid option
                System.err.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
                System.exit(1);
        }
        input.close();

    }
}
/*
1. Create a class named ATMSimulation. Write a program with the following requirements:

   1. Given the following variables:
      - pinNumber: contains the correct pin number of the card
      - accountBalance: current account balance of the card

   2. Ask the user to enter their pin number.
      If the user-entered pin number does not match the correct pin number,
      then the program should be terminated with the following error message:
      	"Incorrect pin number, please try again later."

   3. Ask the user to select from one of the three following options:
      3.1 Check Balance:
          Displays the available balance.

      3.2 Deposit Money:
          Asks the user to enter the amount to deposit and displays the new available balance.

          If the user enters an invalid amount (0 or negative), then the program should
          be terminated with the following error message:
          	"Depositing amount cannot be zero or negative, please try again later."

      3.3 Withdraw Money:
          Asks the user to enter the amount to withdraw and displays the new available balance.

          If the user enters an invalid amount (0 or negative), then the program should
          be terminated with the following error message:
          	"Cannot withdraw zero or negative amount, please try again later."

          If the user-entered amount is greater than the available balance, then the program
          should be terminated with the following error message:
          	"Insufficient funds. Withdrawal failed."

   4. If the user does not select one of the three options above, then the following
   error message should be displayed on the console:
      	"Invalid choice. Exiting the ATM. Thank you for using our services!"
 */