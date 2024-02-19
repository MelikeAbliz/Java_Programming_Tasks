package groupTasks;

import java.util.Scanner;

public class GetNonRepeatingVowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter string: ");//dovelike
        String str = input.next().toLowerCase();
        input.close();
        System.out.println(getNonRepeatingVowel(str));
    }

        public static int getNonRepeatingVowel(String str){
        String uniqueCh = "";
        char remainVowel = ' ';
        if (!str.isEmpty()) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (str.indexOf(ch)==str.lastIndexOf(ch)){
                    uniqueCh+=ch;
                }
            }
                System.out.println(uniqueCh);//unique character in the string: dovlik
                for (int k = 0; k < uniqueCh.length(); k++) {
                    if (uniqueCh.charAt(k) == 'a' || uniqueCh.charAt(k) == 'e'
                            || uniqueCh.charAt(k) == 'i' || uniqueCh.charAt(k) == 'o'
                            || uniqueCh.charAt(k) == 'u') {
                        remainVowel= uniqueCh.charAt(k);//oi
                        break;
                    }
                }
        } return str.indexOf(remainVowel);
    }
}