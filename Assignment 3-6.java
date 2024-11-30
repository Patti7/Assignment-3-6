import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.println("Enter height (feet only): ");
        int feet = input.nextInt();
        System.out.println("Enter height (inches only): ");
        int inches = input.nextInt();

        int totalInches = feet * 12 + inches;

        double heightInMeters = totalInches * 0.0254;

        double weightInKilograms = weight * 0.45359237;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("Your BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else 
            System.out.println("Obese");
    }
}
