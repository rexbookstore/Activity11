import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a binary number: ");
            String binaryNumber = scanner.nextLine();
            
            int decimalNumber = convertToDecimal(binaryNumber);
            
            System.out.println("Decimal Number: " + decimalNumber);
        }
    }

    public static int convertToDecimal(String binaryNumber) {
        int decimal = 0;
        int length = binaryNumber.length();
        
        for (int i = length - 1; i >= 0; i--) {
            int digit = binaryNumber.charAt(i) - '0';
            decimal += digit * Math.pow(2, length - 1 - i);
        }
        
        return decimal;
    }
}
