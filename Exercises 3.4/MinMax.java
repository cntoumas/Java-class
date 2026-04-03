import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number[] = new int[10];        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }

        int min = number[0];
        int max = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        scanner.close();
    }
}   
