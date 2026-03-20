import java.util.Scanner;

class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1-7): ");
        int num = scanner.nextInt();
        String day;
        do {
            switch (num) {
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                case 7:
                    day = "Sunday";
                    break;
                default:
                    day = "Invalid input. Please enter a number between 1 and 7.";
                    break;
            }
            System.out.println(day);
            System.out.println("Enter a number (1-7): ");
            num = scanner.nextInt();
        } while (num > 0 && num < 8);
        System.out.println("Invalid input. Program terminated.");
    }
}