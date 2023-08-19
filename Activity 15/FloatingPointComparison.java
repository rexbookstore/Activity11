import java.util.Scanner;

public class FloatingPointComparison {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input floating-point number: ");
            double number1 = scanner.nextDouble();
            
            System.out.print("Input another floating-point number: ");
            double number2 = scanner.nextDouble();
            
            // Round the numbers to three decimal places for comparison
            double roundedNumber1 = Math.round(number1 * 1000.0) / 1000.0;
            double roundedNumber2 = Math.round(number2 * 1000.0) / 1000.0;
            
            if (roundedNumber1 == roundedNumber2) {
                System.out.println("They are the same");
            } else {
                System.out.println("They are different");
            }
        }
    }
}
