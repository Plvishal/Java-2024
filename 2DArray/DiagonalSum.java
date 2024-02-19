
public class DiagonalSum {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 3, 5, 6 },
                { 4, 6, 8, 3 },
                { 3, 9, 8, 1 },
                { 8, 3, 5, 2 } };
        int res = diagonalSum(matrix);
        System.out.println("Diagonal sum of matrix is : " + res);
    }
}
