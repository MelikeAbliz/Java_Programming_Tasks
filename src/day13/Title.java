package day13;

public class Title {
    public static void main(String[] args) {
        System.out.println(title("jAVA"));
    }
    public static String title(String titleName){
                titleName=(""+titleName.charAt(0)).toUpperCase()+titleName.substring(1).toLowerCase();
        return titleName;
    }
}
/*
Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java

 */