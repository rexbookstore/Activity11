import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input any octal number: ");
            String octalNumber = scanner.nextLine();
            
            String binaryNumber = convertToBinary(octalNumber);
            
            System.out.println("Equivalent binary number: " + binaryNumber);
        }
    }

    public static String convertToBinary(String octalNumber) {
        int decimalValue = Integer.parseInt(octalNumber, 8);
        String binaryValue = Integer.toBinaryString(decimalValue);
        return binaryValue;
    }
}
