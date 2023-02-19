import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Science marks: ");
        int Science = sc.nextInt();
        System.out.println("Enter the Maths marks: ");
        int Maths = sc.nextInt();
        System.out.println("Enter the SS marks: ");
        int SS = sc.nextInt();
        System.out.println("Enter the Gujarati marks: ");
        int Gujarati = sc.nextInt();
        System.out.println("Enter the Sanskrit marks: ");
        int Sanskrit = sc.nextInt();
        int total = Science + Maths + SS + Gujarati + Sanskrit;
        System.out.print("The Total is: ");
        System.out.println(total);
        int Percentage = total*100/500;
        System.out.print("The Percentage is: ");
        System.out.println(Percentage);
        if(Percentage > 90){
            System.out.println("Grade A");
        }
        else if(Percentage > 80){
            System.out.println("Grade B");
        }
        else if(Percentage > 70){
            System.out.println("Grade C");
        }
        else if(Percentage > 60){
            System.out.println("Grade D");
        }
        else if(Percentage > 50){
            System.out.println("Grade E");
        }
        else if(Percentage < 45){
            System.out.println("Grade F");
        }
        else{
            System.out.println("Fail");
        }
    }
}
