import java.util.Scanner;

class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first R: ");
        double R1 = input.nextDouble();
        System.out.print("Enter second R: ");   
        double R2 = input.nextDouble();        
        System.out.println("Enter first theta in degrees: ");
        double theta1 = input.nextDouble();
        System.out.println("Enter second theta in degrees: ");
        double theta2 = input.nextDouble();
        double a1 = R1 * Math.cos(Math.toRadians(theta1));
        double a2 = R2 * Math.cos(Math.toRadians(theta2));
        double b1 = R1 * Math.sin(Math.toRadians(theta1));
        double b2 = R2 * Math.sin(Math.toRadians(theta2));  
        double a = a1 + a2;
        double b = b1 + b2;
        System.out.println("The sum of the two complex numbers in rectangular form is: " + a + " + " + b + "i");
        double R = Math.sqrt(a*a + b*b);
        double theta = Math.toDegrees(Math.atan2(b, a));
        System.out.println("The sum of the two complex numbers in polar form is: " + R + " ∠ " + theta + " degrees"); // The degrees symbol will be printed as ?
        input.close();
    }
}
