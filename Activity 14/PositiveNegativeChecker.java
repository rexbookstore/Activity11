import java.util.Scanner;

public class PositiveNegativeChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input number: ");
            int number = scanner.nextInt();
            
            if (number > 0) {
                System.out.println("Number is positive");
            } else if (number < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }
        }
    }
}