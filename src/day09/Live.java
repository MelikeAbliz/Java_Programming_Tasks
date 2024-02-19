package day09;

public class Live {
    public static void main(String[] args) {
        int peopleNumber=8;
        String result="";
        if (peopleNumber<=3){
            result="Live with less than 3 people";
        } else if (peopleNumber>3&&peopleNumber<=6) {
            result="Live with 3 - 6 people";
        } else if (peopleNumber>6) {
            result="Live with more than 6 people";
        } else {
            result="please enter valid number";
        }
        System.out.println(result);

        System.out.println("-----------------");
        String result1=(peopleNumber<=3)?"Live with less than 3 people"
                :(peopleNumber>3&&peopleNumber<=6)?"Live with 3 - 6 people"
                :(peopleNumber>6)?"Live with more than 6 people":"please enter valid number";
        System.out.println(result1);
    }
}
/*
Ask the user how many people they live with:
            if the user lives with fewer than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

 */