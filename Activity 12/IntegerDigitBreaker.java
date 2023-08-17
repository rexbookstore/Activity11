import java.util.Scanner;

public class IntegerDigitBreaker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input six non-negative digits: ");
            int number = scanner.nextInt();
            
            if (number < 0 || number >= 1000000) {
                System.out.println("Please enter a non-negative integer less than one million.");
            } else {
                int divisor = 100000; // Starting divisor for the leftmost digit
                
                while (divisor >= 1) {
                    int digit = number / divisor;
                    System.out.print(digit + " ");
                    number %= divisor;
                    divisor /= 10;
                }
            }
        }
    }
}
