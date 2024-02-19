package day07;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int number=67;
        int total1=50;
        int total2=75;
        int total3=100;
        String result="";
        if (number==total1||number==total2||number==total3){
            if (number==total1){
                result="20 crew, 30 passengers";
            }else if (number==total2){
                result="25 crew, 50 passengers";
            }else if (number==total3){
                result="30 crew, 70 passengers";
            }
        }else {
            result="Any other number of people on the ship is not valid";
        }
        System.out.println(result);

    }
}
/*
given the number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers.
 Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */