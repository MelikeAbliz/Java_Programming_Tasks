package day07;

public class Browsers {
    public static void main(String[] args) {
        String browserName="chrome";
        String result="";
        if (browserName=="chrome"||browserName=="firefox"||browserName=="opera"||browserName=="safari"||browserName=="edge"){
            if (browserName=="chrome"){
                result="valid browser";
            } else if(browserName=="chrome"){
                result="valid browser";
            }else if (browserName=="chrome"){
                result="valid browser";
            }else if (browserName=="chrome"){
                result="valid browser";
            }else {
                result="invalid browser";
            }
        }
        System.out.println(browserName+" is "+result);
    }
}
/*
Create a class called Browser. Write a program that can display the name of the selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are chrome, firefox, opera, safari, and edge.
        3. if the browser name does not match with the valid browser names, output should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */