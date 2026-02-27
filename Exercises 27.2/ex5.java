import java.util.Scanner;

class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of R1: ");
        double R1 = input.nextDouble();
        System.out.print("Enter the value of R2: ");
        double R2 = input.nextDouble();
        double Rpar = (R1 * R2) / (R1 + R2);
        System.out.println("The parallel resistance is: " + Rpar);
    }
}