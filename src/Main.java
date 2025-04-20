import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("=".repeat(30));
        System.out.println("      FOUR-SQUARE CIPHER      ");
        System.out.println("=".repeat(30));

        System.out.print("Input Key 1: ");
        String key1 = cleanInput(scanner.nextLine());

        System.out.print("Input Key 2: ");
        String key2 = cleanInput(scanner.nextLine());

        if (!isValidKey(key1) || !isValidKey(key2)) {
            System.out.println("Each key must contain up to 25 unique letters (excluding Q).");
            return;
        }

        FourSquareCipher square = new FourSquareCipher(key1, key2);

        while (true) {
            System.out.print("\nType 'E' to encrypt, 'D' to decrypt, or 'Q' to quit: ");
            String choice = scanner.nextLine().trim().toUpperCase();

            if (choice.equals("E")) {
                System.out.print("Enter Plain Text: ");
                String plaintext = cleanInput(scanner.nextLine());
                System.out.println("Encrypted Text: " + square.encrypt(plaintext));
            } else if (choice.equals("D")) {
                System.out.print("Enter Encrypted Text: ");
                String encrypted = cleanInput(scanner.nextLine());
                System.out.println("Decrypted Text: " + square.decrypt(encrypted));
            } else if (choice.equals("Q")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please type E, D, or Q.");
            }
        }
    }

    private static String cleanInput(String input) {
        return input.toUpperCase().replaceAll("[^A-Z]", "").replace("Q", "");
    }

    private static boolean isValidKey(String key) {
        return key.chars().distinct().count() <= 25;
    }
}
