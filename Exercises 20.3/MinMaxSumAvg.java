import java.util.Scanner;

class MinMaxSumAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min=0, max=0, sum=0;
        double avg=0.0;
        int i = 0;
        do { 
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
                if (i == 0) {
                    min = num;
                    max = num;
                    sum = num;
                }
                else {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                sum += num;
                avg = (double) sum / (i + 1);
                }
            i++;
        } while (i<=9);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);      
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
    }
    
}