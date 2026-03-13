import java.util.Scanner;

public class ex1if
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        int grade = input.nextInt();
        if (grade >= 5 & grade <= 10){
            System.out.println("Passed");
        }
        else if (grade >= 0 & grade < 5){
            System.out.println("Failed");
        }
        else {
            System.out.println("Invalid grade");
        }

    }
}