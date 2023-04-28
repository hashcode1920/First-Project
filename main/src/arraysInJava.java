import java.util.Arrays;
import java.util.Scanner;

public class arraysInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] marks = new int[size];

        //input:
        for (int j=0; j<size; j++) {
            marks[j] = sc.nextInt();
        }
        System.out.println("please enter value that you want from marks :  ");
        int x = sc.nextInt();
        //output:
        for(int i=0; i<marks.length; i++){
            if(marks[i] == x) {
                System.out.println("x found at index : " + i);
            }
        }
    }
}
