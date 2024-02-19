package week04;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String word = "java";
        String sentence = "Java Java Java JAVA Java";

        String temp=sentence.toLowerCase().replace(word.toLowerCase(),word.substring(1));
        int frequency = sentence.length() - temp.length();
        System.out.println(frequency);
        System.out.println(sentence.length());
        System.out.println(temp.length());

    }
}
/*
3. Create a class named FrequencyOfAWord. Given the following variables:
			word: contains a single word
			sentence: contains a sentence

	Write a program that calculates the frequency of the word from the given sentence.

			Example:
				word = "java"
				sentence = "Java Java Java JAVA Java"

			Output:
				5

	Do not implement any new topics (loops, custom methods, etc.).
 */