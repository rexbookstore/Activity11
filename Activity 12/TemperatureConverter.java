import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a degree in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            
            double celsius = (fahrenheit - 32) * 5.0 / 9.0;
            
            System.out.printf("%.1f degree Fahrenheit is equal to %.1f in Celsius%n", fahrenheit, celsius);
        }
    }
}
