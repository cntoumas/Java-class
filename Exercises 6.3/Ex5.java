import java.util.Scanner;

class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter resistance value in Ohms: ");
        double Res = input.nextDouble();
        System.out.print("Enter frequency in Hz: ");
        double freq = input.nextDouble();
        System.out.print("Enter inductance value in mH: ");
        double L = input.nextDouble();
        double Z = Math.sqrt(Math.pow(Res, 2) + Math.pow(2 * Math.PI * freq * L * Math.pow(10, -3), 2));
        double tanf = Math.tan(Math.toRadians(2 * Math.PI * freq * L * Math.pow(10, -3) / Res));
        System.out.println("The impedance is: " + Z + " Ohms");
        System.out.println("The phase angle is: " + tanf + " radians");
        input.close();
    }
}