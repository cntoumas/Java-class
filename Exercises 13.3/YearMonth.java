import java.util.Scanner;

public class YearMonth
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month (1-12): ");
        int month = input.nextInt();
        switch (month) {
            case 1,3,5,7,8,10,12 -> System.out.print("31 days");
            case 4,6,9,11 -> System.out.print("30 days");
            case 2 -> {
                System.out.print("Enter a year: ");
                int year = input.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.print("29 days");
                } else {
                    System.out.print("28 days");
                }
            }
        }
    }    
}