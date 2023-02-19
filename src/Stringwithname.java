import java.util.Scanner;

public class Stringwithname {
    public static void main(String[] args) {
        System.out.println("Enter your name below: ");
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();
        System.out.println("Hello " + name + " welcome to the Java program.");
    }
}
