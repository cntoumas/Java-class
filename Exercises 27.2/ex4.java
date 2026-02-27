import java.util.Scanner;

class ex4 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = input.nextDouble();
        System.out.println("Enter number b: ");
        double b = input.nextDouble();
        System.out.println("Enter number c: ");
        double c = input.nextDouble();
        System.out.println("Enter number d: ");
        double d = input.nextDouble();
        double sum = a + b + c + d;
        System.out.println("The sum of the numbers is: " + sum);
    }
}