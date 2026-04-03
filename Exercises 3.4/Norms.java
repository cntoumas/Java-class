
public class Norms {
    public static void main(String[] args) {
        int A[][] = {{5, -4, 2},
            {-1, 2, 3},
            {-2, 1, 0}
        };

        int A_oneNorm = 0;          
        int A_infinityNorm = 0;     
        double A_euclideanNorm = 0;    

        for (int i = 0; i < A.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < A[i].length; j++) {
                rowSum += Math.abs(A[i][j]);
                A_euclideanNorm += A[i][j] * A[i][j];
            }
            if (rowSum > A_infinityNorm) {
                A_infinityNorm = rowSum;
            }
        }


        for (int j = 0; j < A[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < A.length; i++) {
                colSum += Math.abs(A[i][j]);
            }
            if (colSum > A_oneNorm) {
                A_oneNorm = colSum;
            }
        }

        A_euclideanNorm = Math.sqrt(A_euclideanNorm);

        System.out.println("A matrix:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("||A||_1 (max column sum) = " + A_oneNorm);
        System.out.println("||A||_∞ (max row sum) = " + A_infinityNorm);
        System.out.println("||A||_E (Euclidean norm) = " + A_euclideanNorm);
    }
}