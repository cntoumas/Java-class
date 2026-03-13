import java.util.Scanner;

public class ex1switch
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        int grade = input.nextInt();
        switch (grade) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Passed");
                break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}