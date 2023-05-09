import java.util.Scanner;

public class oddEvenInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        int r = num%2;
        if (num %2 == 0) {

            System.out.println("This number is Even...");
        }
        else {
            System.out.println(r);
            System.out.println("The number is Odd...");
        }

    }
}
