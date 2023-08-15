import java.util.Scanner;

public class HexadecimalToBinary {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Hexadecimal Number: ");
            String hexadecimalNumber = scanner.nextLine();
            
            String binaryNumber = convertToBinary(hexadecimalNumber);
            
            System.out.println("Equivalent Binary Number is: " + binaryNumber);
        }
    }

    /**
     *
     * @param hexadecimalNumber
     * @return
     */
    public static String convertToBinary(String hexadecimalNumber) {
        int decimalValue = Integer.parseInt(hexadecimalNumber, 16);
        String binaryValue = Integer.toBinaryString(decimalValue);
        return binaryValue;
    }
}
