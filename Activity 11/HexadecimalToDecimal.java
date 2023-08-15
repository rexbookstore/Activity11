import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a hexadecimal number: ");
            String hexadecimalNumber = scanner.nextLine();
            
            int decimalNumber = convertToDecimal(hexadecimalNumber);
            
            System.out.println("An equivalent decimal number is: " + decimalNumber);
        }
    }

    public static int convertToDecimal(String hexadecimalNumber) {
        int decimalValue = Integer.parseInt(hexadecimalNumber, 16);
        return decimalValue;
    }
}
