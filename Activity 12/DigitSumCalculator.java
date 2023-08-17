import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input an integer between 0 and 1000: ");
            int number = scanner.nextInt();
            
            if (number < 0 || number > 1000) {
                System.out.println("Please enter a valid integer between 0 and 1000.");
            } else {
                int sum = 0;
                int originalNumber = number;
                
                while (number > 0) {
                    int digit = number % 10;
                    sum += digit;
                    number /= 10;
                }
                
                System.out.printf("The sum of all digits in %d is %d%n", originalNumber, sum);
            }
        }
    }
}
