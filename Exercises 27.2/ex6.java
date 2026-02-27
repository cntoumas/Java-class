import java.util.Scanner;

class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the frequency in MHz: ");
        double frequency = input.nextDouble() * (1000000); 
        double wavelength = (300000000) / frequency;
        System.out.println("The wavelength is: " + wavelength + " meters.");
    }
}
