import java.util.Scanner;
public class CroreToMillion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in Crore");
        int number = sc.nextInt();
        number = number*10000000;
        System.out.println("The value in Million is: ");
        System.out.println(number);
    }
}
