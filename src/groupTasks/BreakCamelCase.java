package groupTasks;

public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(breakCamelCase("camelCasing"));
        System.out.println(breakCamelCase("weLoveProgramming"));
        System.out.println(breakCamelCase(""));
    }

    public static String breakCamelCase(String str) {
        if (str.length()==0){
            return "";
        }
        char[] ch = str.toCharArray();
        String result = "";
        for (int i = 0; i < str.length()-1; i++) {
            result = result + ch[i];
            if (Character.isUpperCase(ch[i + 1])) {
                result = result + " ";
            }
        }
        result = result + ch[str.length() - 1];
        return result;
    }
}
/*
Question-1 Break Camel Case
Write a function, breakCamelCase, that takes a camel-cased string as input and
returns a new string with spaces inserted between words.
The function should handle empty or null input.
Examples:
"camelCasing" => "camel Casing" "weLoveProgramming" => "we Love Programming" "identifier" => "identifier"
"" => ""
null => ""
 */