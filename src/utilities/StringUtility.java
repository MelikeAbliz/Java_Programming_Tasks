package utilities;

public class StringUtility {
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static int frequency(String str, char ch) {
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                frequency++;
            }
        }
        return frequency;
    }

    public static int frequency(String sentence, String word) {
        int frequency = 0;
        while (sentence.contains(word)){
           sentence=sentence.replaceFirst(word,"");
            frequency++;
        }
        return frequency;
    }

    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }

        }

        return result;
    }
}
