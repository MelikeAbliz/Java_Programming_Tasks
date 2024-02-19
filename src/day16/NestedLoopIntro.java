package day16;

public class NestedLoopIntro {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            System.out.println(" hello word");
        }
        System.out.println("---nested loop start----");
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.println(" hello word");
            }
        }
    }
}
