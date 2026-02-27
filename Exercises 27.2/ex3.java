import java.util.Scanner;

class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length in inches: ");
        double inches = input.nextDouble();
        double centimeters = inches * 2.54;
        System.out.println(inches + " inches is equal to " + centimeters + " centimeters.");
    }
}