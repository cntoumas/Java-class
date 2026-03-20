import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int factorial;
        if (num == 0 || num == 1) {
            factorial = 1;
        }
        else {
            factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}