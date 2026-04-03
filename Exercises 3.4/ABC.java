import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[20];
        System.out.println("Enter 10 numbers for array A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Enter 10 numbers for array B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            C[i + A.length] = B[i];
        }

        System.out.println("Array C (combination of A and B):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}

