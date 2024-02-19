import java.util.Scanner;

public class TwoArrayCreation {
    public static boolean searchMatrixByKey(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {

                    System.out.print("Key Found at  : " + "(" + i + "," + j + ")");
                    return true;
                }
            }

        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        int key = 5;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

        searchMatrixByKey(matrix, key);

    }

}
