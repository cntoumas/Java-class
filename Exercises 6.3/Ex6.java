import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the peak voltage (Vm): ");
        double Vm = input.nextDouble();
        double Vdc = (2 * Vm) / Math.PI;
        double Vrms = Vm / Math.sqrt(2);
        double Vr = Math.sqrt(Math.pow(Vrms, 2) - Math.pow(Vdc, 2));
        double rippleFactor = Vr / Vdc;
        System.out.println("The ripple factor is: " + rippleFactor);
        input.close();
    }
}