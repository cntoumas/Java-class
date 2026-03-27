import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Length of the string: " + input.length());
        if (input.length() >= 2) {
            System.out.println("The character at index 2 is: " + input.charAt(1));
        } else {
            System.out.println("The string is too short to access index 2.");
        }
    }
}