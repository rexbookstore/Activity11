import java.util.Scanner;

public class InchToMeterConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a value for inch: ");
            double inches = scanner.nextDouble();
            
            double meters = inches * 0.0254;
            
            System.out.printf("%.1f inch is %.1f meters%n", inches, meters);
        }
    }
}
