import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Please select an action; Encode, Decode or Exit");
        String choice = scanner.next();
        scanner.next();
    }
}
