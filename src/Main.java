import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //input:
      Scanner sc = new Scanner(System.in);
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        */
        //KEYWORDS:
       /* Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Child");
        }
        */
        //EVEN OR ODD using else if statement:
       /*Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Equal");
        }
        else if (a > b) {
                System.out.println("a is greater then b");
        }
        else {
                System.out.println("a is lesser then b");
        }*/
        /*int button = sc.nextInt();
        if(button == 1){
            System.out.println("Hello");
        }
        else if(button == 2){
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Holla");
        } else {
            System.out.println("Invalid button");
        }*/

        //Switch:
        int Calculator = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (Calculator) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(a % b);
                break;


        }
    }
}
