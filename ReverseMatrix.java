import java.util.Scanner;
public class ReverseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of Columns: ");
        int col = sc.nextInt();
        int valueToStore = 1;

        // Index starts for 0
        // Index of array lise between 0 to x-n

        int[][] matrix = new int[row][col];
        boolean flagToSwapRowPosition = true;
        int top = 0;
        int bottom = row;
        boolean direction = true;
        int rowCountForDirection = 0;
        int rowSum = 0;
        int colSum = 0;
        int total = 0;
        for (int i = 0; i < row; i++) {

//            System.out.println(rowSum);
            if (flagToSwapRowPosition) {
                if (direction) {
                    for (int j = 0; j < col; j++) {
                        matrix[top][j] = valueToStore;
                        valueToStore++;
                    }
                } else {
                    for (int j = col - 1; j >= 0; j--) {
                        matrix[top][j] = valueToStore;
                        valueToStore++;
                    }
                }
                flagToSwapRowPosition = false;
                bottom--;
            }
            else {
                if (direction) {
                    for (int j = 0; j < col; j++) {
                        matrix[bottom][j] = valueToStore;
                        valueToStore++;
                    }
                }
                else {
                    for (int j = col - 1; j >= 0; j--) {
                        matrix[bottom][j] = valueToStore;
                        valueToStore++;
                    }
                }
                flagToSwapRowPosition = true;
                top++;
            }
            rowCountForDirection++;

            if (rowCountForDirection == 2) {
                direction = ! direction;
                rowCountForDirection = 0;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int n = matrix[i][j];
                if (n < 10) {
                    System.out.print(n + "\t");
                } else {
                    System.out.print(n + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("\nSum of rows and columns: \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int n = matrix[i][j];
                if (n < 10) {
                    System.out.print(n + "\t");
                    rowSum += n;
                } else {
                    System.out.print(n + "\t");
                    rowSum += n;
                }
            }
            total += rowSum;
            System.out.print(rowSum);
            System.out.println();
            rowSum = 0;
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                int n = matrix[j][i];
                if (n < 10) {
//                    System.out.print(n + "\t");
                    colSum += n;

                } else {
//                    System.out.print(n + "\t");
                    colSum += n;
                }
            }
            total += colSum;
            System.out.print(""+colSum+"\t");
            System.out.print("");
            colSum = 0;
        }
        System.out.print(total);
    }
}


