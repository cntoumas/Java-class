public class matrixMult {
    public static void main(String[] args) {
        int[][] A = {{5, -4, 2},
            {-1, 2, 3},
            {-2, 1, 0}
        };
        int[][] B = {{4, -3, 2},
            {0, 1, 6},
            {-8, 4, 9}          
        };

        int[][] C = new int[3][3];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                for (int k = 0; k < A.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Result of A x B:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}