import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Version by Tasneem 🌟 ===");
        
        System.out.print("Enter some text: ");
        String input = scanner.nextLine();

        int charCount = input.length();
        System.out.println("Edited by Tasneem 👩‍💻");
        System.out.println("Number of characters (including spaces): " + charCount);

        scanner.close();
    }
}
