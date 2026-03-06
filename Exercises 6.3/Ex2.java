import java.util.Scanner;   

class Ex2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a real number: ");
        double number = input.nextDouble();
        int integer;
        integer = (int) number;
        if ((number - integer) != 0) {
           System.out.println("The number is not an integer."); 
        } else {
            System.out.println("The number is an integer.");
        }
        input.close();
    }
}