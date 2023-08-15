import java.util.Scanner;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a binary number: ");
            String binaryNumber = scanner.nextLine();
            
            String hexadecimalValue = convertToHexadecimal(binaryNumber);
            
            System.out.println("Hexadecimal value: " + hexadecimalValue);
        }
    }

    public static String convertToHexadecimal(String binaryNumber) {
        int decimalValue = Integer.parseInt(binaryNumber, 2);
        String hexadecimalValue = Integer.toHexString(decimalValue).toUpperCase();
        return hexadecimalValue;
    }
}
