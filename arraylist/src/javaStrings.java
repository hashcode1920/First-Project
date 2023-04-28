import java.util.Scanner;

public class javaStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String str = sc.nextLine();
        System.out.println("The name is : " + str);
        System.out.println("The length of String is " + str.length());
    }
}
