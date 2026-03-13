import java.util.Scanner;

public class ex2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter bodyweight (kg): ");
        double bodyweight = input.nextDouble();
        System.out.print("Enter height (m): ");
        double height = input.nextDouble();
        double bmi = bodyweight / (height * height);
        if (bmi < 18.5) {
            System.out.print("Underweight");
        } 
        else if (bmi < 25) {
            System.out.print("Normal weight");
        } 
        else if (bmi < 30){
            System.out.print("Overweight");
        }
        else {
            System.out.print("Obese");
        }
    }
}