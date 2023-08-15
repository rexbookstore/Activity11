import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input a binary number: ");
            String binaryNumber = scanner.nextLine();
            
            String octalNumber = convertToOctal(binaryNumber);
            
            System.out.println("Octal number: " + octalNumber);
        }
    }

    public static String convertToOctal(String binaryNumber) {
        int decimalValue = Integer.parseInt(binaryNumber, 2);
        String octalValue = Integer.toOctalString(decimalValue);
        return octalValue;
    }
}
