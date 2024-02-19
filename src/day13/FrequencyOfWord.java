package day13;

public class FrequencyOfWord {
    public static void main(String[] args) {

        System.out.println(frequencyOfWord("java java JAVA", "java"));
    }

    public static int frequencyOfWord(String sentence, String word) {
        int count = 0;
        sentence=sentence.toLowerCase();
        word=word.toLowerCase();
        while (sentence.contains(word)) {
            count++;
            sentence = sentence.replaceFirst(word, "");
        }
        return count;
    }
}
/*
Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4
 */