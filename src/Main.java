import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Four-Square Cipher");

        System.out.println("Input Key 1: ");    
        String key1 = scanner.nextLine().toUpperCase().replaceAll("[^A-Z]", "");

        System.out.println("Input Key 2: ");
        String key2 = scanner.nextLine().toUpperCase().replaceAll("[^A-Z]", "");

        while(true) {
            System.out.println("Type 'E' to encrypt or 'D' to decrypt: ");
            String choice = scanner.nextLine().trim().toUpperCase();

            if (choice.equals("E")) {
                System.out.println("Enter Plain Text: ");
                String plaintext = scanner.nextLine().toUpperCase().replaceAll("[^A-Z]", "");
//                System.out.println("Encrypted Text: " + encrypt(plaintext));
            } else if (choice.equals("D")) {
                System.out.println("Enter Encryptet Text: ");
                String encrypted = scanner.nextLine().toUpperCase().replaceAll("[^A-Z]", "");
//                System.out.println("Decrypted Text: " + decrypt(encrypted));
            }
        }
    }

    private static void encrypt(String text){

    }

    private static void decrypt(String text){

    }
}