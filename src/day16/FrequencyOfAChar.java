package day16;

public class FrequencyOfAChar {
    public static void main(String[] args) {
        String str = "acbacbc";
        char ch = 'c';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(ch==str.charAt(i)) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
/*
write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
 */