import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input an octal number: ");
            String octalNumber = scanner.nextLine();
            
            String hexadecimalNumber = convertToHexadecimal(octalNumber);
            
            System.out.println("Equivalent hexadecimal number: " + hexadecimalNumber);
        }
    }

    public static String convertToHexadecimal(String octalNumber) {
        int decimalValue = Integer.parseInt(octalNumber, 8);
        String hexadecimalValue = Integer.toHexString(decimalValue).toUpperCase();
        return hexadecimalValue;
    }
}
