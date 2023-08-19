import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input an alphabet: ");
            String input = scanner.next();
            
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Error: Please enter a single letter.");
            } else {
                char letter = input.charAt(0);
                char lowercaseLetter = Character.toLowerCase(letter);
                
                if (lowercaseLetter == 'a' || lowercaseLetter == 'e' || lowercaseLetter == 'i'
                        || lowercaseLetter == 'o' || lowercaseLetter == 'u') {
                    System.out.println("Input letter is Vowel");
                } else {
                    System.out.println("Input letter is Consonant");
                }
            }
        }
    }
}
