package day08;

public class Browsers {
    public static void main(String[] args) {
        String browserName="chrome";
        String result="";

        switch (browserName){
            case "chrome":
                result=browserName+" is valid browser";
                break;
            case "firefox":
                result=browserName+" is valid browser";
                break;
            case "opera":
                result=browserName+" is valid browser";
                break;
            case "safari":
                result=browserName+" is valid browser";
                break;
            case "edge":
                result=browserName+" is valid browser";
                break;
            default:
                result=browserName+" is not invalid browser";

        }
        System.out.println(result);

    }
}
/*
write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, the output should be:
             Invalid Browser

        	Do Not use if statement or ternary
 */