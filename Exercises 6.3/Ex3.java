import java.util.Scanner;

class Ex3 {
    static final double C = Math.pow(10, 8) * 3; 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter frequency: ");
        double freq = input.nextDouble();
        System.out.print("Enter distance: ");
        double d = input.nextDouble();
        double Ldb = 20 * Math.log10(d) + 20 * Math.log10(freq) + 20 * Math.log10((4*Math.PI)/C);
        System.out.println("The path loss is: " + Ldb + " dB");
        input.close();
    }
}