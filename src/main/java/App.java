import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select an action(answer with number 1, 2 or 3); 1. Encode, 2. Decode or 3. Exit");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.println("Enter a text");
            String inputText = scanner.nextLine().toUpperCase();
            System.out.println("Enter a key");
            int key = scanner.nextInt();
            Encoding encoding = new Encoding(inputText, key);
            System.out.println(String.format("your input text was: %s", encoding.getInputText()));
            System.out.println(String.format("Your encrypted text is: %s", encoding.encode()));
        } else if (choice == 2) {
            System.out.println("Enter an encrypted text to decrypt");
            String inputText = scanner.nextLine().toUpperCase();
            System.out.println("Enter a key");
            int key = scanner.nextInt();
            Decoding decoding = new Decoding(key, inputText);
            System.out.println(String.format("Your input text was: %s", decoding.getInputText()));
            System.out.println(String.format("Your decrypted text is: %s", decoding.decode()));
        } else if (choice == 3) {
            System.exit(0);
        }

        else{
            System.out.println("Input is unknown");

        }

        }
    }

