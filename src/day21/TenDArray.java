package day21;

public class TenDArray {
    public static void main(String[] args) {
        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};
        for (String[][][][][][][][][] nineD : array) {
            for (String[][][][][][][][] eightD : nineD) {
                for (String[][][][][][][] sevenD : eightD) {
                    for (String[][][][][][] sixD : sevenD) {
                        for (String[][][][][] fiveD : sixD) {
                            for (String[][][][] fourD : fiveD) {
                                for (String[][][] threeD : fourD) {
                                    for (String[][] twoD : threeD) {
                                        for (String[] singleD : twoD) {
                                            for (String eachElement : singleD) {
                                                System.out.print(eachElement+" ");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
/*
Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can display each element of the given array



 */