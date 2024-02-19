package day22;

public class EqualsNumOfLowerUpper {
    public static void main(String[] args) {
       String str = "JAVA java";
        System.out.println(equalLowerUpper(str));
    }
    public static boolean equalLowerUpper(String str){
        int isLowerCase=0;
        int isUpperCase=0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))){
                isLowerCase++;

            }
            else if (Character.isUpperCase(str.charAt(i))){
               isUpperCase++;
            }
        }if (isUpperCase==isLowerCase){
            return true;
        }else return false;
    }
}
/*
        6. Write a program that returns true if the total number of uppercase characters is equal to the total number of Lowercase characters of a string
        Ex:
        str = "JAVA java";

        output:
        true

        Note: Use Wrapper class methods

 */