package day24;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveFirstLastSameCh {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        arrayList.removeIf(a->a.toLowerCase().charAt(0)==a.toLowerCase().charAt(a.length()-1));
        System.out.println(arrayList);
        arrayList.removeIf(p -> p.substring(0, 1).equalsIgnoreCase(p.substring(p.length() - 1)));
        System.out.println(arrayList);

    }
}
/*
. Write a program that can remove string elements from an ArrayList if the first and last characters of the string are the same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Canada","Lan", "Ebrahim", "Farida"]

 */