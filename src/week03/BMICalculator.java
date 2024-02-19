package week03;

public class BMICalculator {
    public static void main(String[] args) {
        double height = 1.75,
                weight = 78.5;

        if (height <= 0 && weight <= 0) { // if both height and weight are invalid
            System.err.println("Height and weight can not be negative or zero");
            System.exit(1);  // terminates the entire program
        }

        if (height <= 0) { // if only the height is invalid
            System.err.println("Height can not be negative or zero");
            System.exit(1);  // terminates the entire program
        }

        if (weight <= 0) { //// if only the weight is invalid
            System.err.println("Weight can not be negative or zero");
            System.exit(1);
        }

        double bmi = weight / (height * height);
        String bmiCategory;

        if (bmi < 18.5) { //  false ===> bmi >= 18.5
            bmiCategory = "Underweight";
        } else if (bmi < 25) {  // false ===> bmi >= 25
            bmiCategory = "Normal Weight";
        } else if (bmi < 30) { // false ===> bmi >= 30
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obesity";
        }


        System.out.println("Your Body Mass Index (BMI): " + bmi);
        System.out.println("Category: " + bmiCategory);

        switch (bmiCategory) {
            case "Overweight":
                System.out.println("Suggestion: Stick to the diet");
                break;

            case "Obesity":
                System.out.println("Suggestion: Stick to the diet and engage in more exercise");

        }


    }
}
/*
1. Create a Java class named BMICalculator with the following requirements:

	Define two variables within the class:
		height: Represents the user's height in meters.
		weight: Represents the user's weight in kilograms.

	Write a program that calculates the user's Body Mass Index (BMI) using the formula:

		BMI = weight / (height * height)

	Determine the BMI category based on the calculated BMI using the following criteria:

		Underweight: BMI < 18.5
		Normal Weight: 18.5 <= BMI < 25
		Overweight: 25 <= BMI < 30
		Obesity: BMI >= 30

	Display the calculated BMI and BMI category in the following format:

		Example:
			height = 1.75
			weight = 73.5

		Output:
			Your Body Mass Index (BMI): 24.0
			Category: Normal Weight

	Ensure that the program provides accurate BMI calculations and
	clearly communicates the user's BMI category based on the specified criteria.

 */