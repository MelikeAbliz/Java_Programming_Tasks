package day18;

public class HighestFrequency {
    public static void main(String[] args) {
        String str = "aaabbccccddeeee";
        String result = "";
        int max = 0;
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == each) {
                    count++;
                }
            }
            if (result.contains("" + each)) {
                continue;
            }
            result += each + "" + count+" ";
            if (count > max) {
               ch=str.charAt(i);
            }
        }
        System.out.println(ch);
        System.out.println(result);
    }
}
/*
 Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e

 */