import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Character Counter Tool ===");
        System.out.print("Enter some text: ");
        String input = scanner.nextLine();

        int charCount = input.length();
        System.out.println("Edited by Asma 👩‍💻");
        System.out.println("Number of characters (including spaces): " + charCount);

        scanner.close();
    }
}
