import java.util.Scanner;

public class PowersCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();
            
            double square = Math.pow(number, 2);
            double cube = Math.pow(number, 3);
            double fourthPower = Math.pow(number, 4);
            
            System.out.printf("Square: %.2f%n", square);
            System.out.printf("Cube: %.2f%n", cube);
            System.out.printf("Fourth power: %.2f%n", fourthPower);
        }
    }
}
