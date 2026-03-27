import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (MM/DD/YYYY): ");
        String date = scanner.nextLine();
        String month = date.substring(0, 2);
        String day = date.substring(3, 5);
        String year = date.substring(6);
        System.out.println("The date in DD/MM/YYYY format is: " + day + "/" + month + "/" + year);
    }
}