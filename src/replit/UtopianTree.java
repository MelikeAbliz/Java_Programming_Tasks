package replit;

public class UtopianTree {
    public static void main(String[] args) {
        int j=3;
        for (int i = 1; i <=10; i++) {
            if (i <= 3) {
                System.out.println("year " + i + " - growth " + 1 + " cm\n" +
                        "tree size: " + i + " cm");
            }
            if (i > 3) {
                System.out.println("year " + i + " - growth " + 2 + " cm\n" +
                        "tree size: " + (j+=2) + " cm");
            }
        }
    }
}
/*
year 1 - growth 1 cm
tree size: 1 cm
year 2 - growth 1 cm
tree size: 2 cm
year 3  - growth 1 cm
tree size: 3 cm
year 4 - growth 2 cm
tree size: 5 cm
year 5 - growth 2 cm
tree size: 7 cm
year 6 - growth 2 cm
tree size: 9 cm
... until you reach year 10
 */