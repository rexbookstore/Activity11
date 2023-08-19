public class FirstTenNaturalNumbers {
    public static void main(String[] args) {
        System.out.print("The first 10 natural numbers are: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i < 10) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
