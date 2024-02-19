package quiz;

import java.util.Scanner;

public class getVolwesAndParty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String result="";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e'
                    || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u') {
                result+=word.charAt(i);
            }
        }
        System.out.println(result);

        System.out.println("===-----------");
        String answer="yes";
        String guestsList="";
        String name="";
        int count=0;
        do{
            System.out.println("Please enter the guest's name:");
            name=input.nextLine();
            System.out.println("Do you want to enter another guest's name?");
            answer=input.nextLine();
            count++;
            if (count>1){
            guestsList+=", "+name;
            }else guestsList=name;
        }while (answer.equals("yes"));
        if (answer.equals("no")){
            System.out.println("Guests' list: "+guestsList);
        }
    }
}
