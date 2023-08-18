import java.util.Scanner;

public class NumberDescription {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a number: ");
            double number = scanner.nextDouble();
            
            System.out.println("Input value: " + number);
            
            if (number == 0) {
                System.out.println("Zero");
            } else if (number > 0) {
                System.out.print("Positive ");
                if (Math.abs(number) < 1) {
                    System.out.println("small");
                } else if (number > 1000000) {
                    System.out.println("large");
                }
            } else {
                System.out.print("Negative ");
                if (Math.abs(number) < 1) {
                    System.out.println("small");
                } else if (Math.abs(number) > 1000000) {
                    System.out.println("large");
                }
            }
        }
    }
}