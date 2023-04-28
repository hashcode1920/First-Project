import java.util.Scanner;

public class twoDArrayInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of Rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the numbers of Columns : ");
        int cols = sc.nextInt();

        //input rows:
        System.out.println("Enter the Data : ");
        int[][] numbers = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            //input columns:
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        //output:
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        int x = sc.nextInt();
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(numbers[i][j] == x) {
                    System.out.println("X found at index of (" + i + ", " + j + ")");
                }
            }
        }

    }
}
