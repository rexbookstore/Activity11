import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input any octal number: ");
            String octalNumber = scanner.nextLine();
            
            int decimalNumber = convertToDecimal(octalNumber);
            
            System.out.println("Equivalent decimal number: " + decimalNumber);
        }
    }

    public static int convertToDecimal(String octalNumber) {
        int decimalValue = Integer.parseInt(octalNumber, 8);
        return decimalValue;
    }
}
