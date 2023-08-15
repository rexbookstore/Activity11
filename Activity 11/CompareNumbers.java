import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input first integer: ");
            int firstNumber = scanner.nextInt();
            
            System.out.print("Input second integer: ");
            int secondNumber = scanner.nextInt();
            
            // Compare the numbers and print the results in a single line
            System.out.println(firstNumber + " != " + secondNumber);
            System.out.println(firstNumber + " < " + secondNumber);
            System.out.println(firstNumber + " <= " + secondNumber);
        }
    }
}
