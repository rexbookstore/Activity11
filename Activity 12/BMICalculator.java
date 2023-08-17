import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input weight in pounds: ");
            double weightPounds = scanner.nextDouble();
            
            System.out.print("Input height in inches: ");
            double heightInches = scanner.nextDouble();
            
            double weightKg = weightPounds * 0.453592; // Convert pounds to kilograms
            double heightMeters = heightInches * 0.0254; // Convert inches to meters
            
            double bmi = weightKg / (heightMeters * heightMeters);
            
            System.out.println("Body Mass Index is " + bmi);
        }
    }
}
