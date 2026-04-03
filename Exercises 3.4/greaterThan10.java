import java.util.Scanner;

public class greaterThan10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int [] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Numbers greater than 10:");
        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] > 10) {
                System.out.println(numbers[i]);
            }
        }
        scanner.close();
    }
}