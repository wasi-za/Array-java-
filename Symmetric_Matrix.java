public class Symmetric_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        boolean Symmetric = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    Symmetric = false;
                    break;
                }
            }
            if (!Symmetric) break;
        }

        if (Symmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }
}
