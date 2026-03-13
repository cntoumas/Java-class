import java.util.Scanner;

public class ex3switch
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter another number: ");
        double num2 = input.nextDouble();
        System.out.print("Select an operation (+, -, *, /): ");
        String op = input.next();
        double result = 0;
        switch (op) {
            case "+":
                result = num1 + num2;
                System.out.print("Result: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.print("Result: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.print("Result: " + result);
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.print("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}