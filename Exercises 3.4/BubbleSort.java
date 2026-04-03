import java.util.Scanner;   

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number[] = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + " ");
        }

        // Bubble Sort Algorithm
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - i - 1; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted numbers:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + " ");
        }
        scanner.close();
    }
}