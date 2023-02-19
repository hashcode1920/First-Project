import java.util.Scanner;

public class KmToCm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kilometer: ");
        Double km = sc.nextDouble();
        double Double = km*0.62137;
        System.out.println("The conversion of Kilometers to Miles is: ");
        System.out.println(Double);

    }
}
