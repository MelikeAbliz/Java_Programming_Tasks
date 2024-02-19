package day08;

public class NumberToWord {
    public static void main(String[] args) {
        int num=30;
        String numberToWord=(num==0)?"zero":(num==1)?"one":(num==2)?"two":(num==3)?"three":(num==4)?"four":
                (num==5)?"five":(num==6)?"six":(num==7)?"seven":(num==8)?"eight":(num==9)?"nine":
                        (num==10)?"ten":"please enter 0-10 number";
        System.out.println(numberToWord);


    }
}
/*
write a Java program that can convert numbers between 0 ~ and 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary
 */