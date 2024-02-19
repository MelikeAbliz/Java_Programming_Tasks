package quiz;

public class InterviewDemo {
    public static void main(String[] args) {
        System.out.println(getMax(10, 9));
    }

    public static double getMax(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }
}
