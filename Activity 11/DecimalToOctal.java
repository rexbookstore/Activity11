import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();

        String octalNumber = convertToOctal(decimalNumber);

        System.out.println("Octal number is: " + octalNumber);

        scanner.close();
    }

    public static String convertToOctal(int decimalNumber) {
        StringBuilder octal = new StringBuilder();
        
        if (decimalNumber == 0) {
            octal.append("0");
        } else {
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 8;
                octal.insert(0, remainder);
                decimalNumber /= 8;
            }
        }
        
        return octal.toString();
    }
}
