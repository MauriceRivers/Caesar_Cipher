package CaesarCipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for message
        System.out.print("Enter a message to be encrypted or decrypted: ");
        String message = scanner.nextLine();

        // Prompt user for key value
        System.out.print("Enter an integer key value for encryption or decryption: ");
        int key = scanner.nextInt();

        // Prompt user for encryption or decryption
        System.out.print("Enter 'E' to encrypt or 'D' to decrypt: ");
        String input = scanner.next();

        CaesarCipher cipher = new CaesarCipher(key);

        // Encrypt or decrypt message based on user input
        String result = "";
        if (input.equalsIgnoreCase("E")) {
            result = cipher.encrypt(message);
        } else if (input.equalsIgnoreCase("D")) {
            result = cipher.decrypt(message);
        }

        // Display result
        System.out.println("Result: " + result);
    }
}