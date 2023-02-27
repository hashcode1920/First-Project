import java.util.*;
public class Marks2 {
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter science marks: ");
            int science = sc.nextInt();
            System.out.print("Enter maths marks: ");
            int maths = sc.nextInt();
            System.out.print("Enter ss marks: ");
            int ss = sc.nextInt();
            System.out.print("Enter gujarati marks: ");
            int gujarati = sc.nextInt();
            System.out.print("Enter sanskrit marks: ");
            int sanskrit = sc.nextInt();
            int total = science + maths + ss + gujarati + sanskrit;
            System.out.println("The percentage is :" + total*100/250);
            int percentage = total*100/250;

            if(percentage > 90){
                System.out.println("Grade A \n");
            }
            else if(percentage > 80){
                System.out.println("Grade B \n");
            }
            else if(percentage  >  70){
                System.out.println("Grade C \n");
            }
            else if(percentage < 60){
                System.out.println("Grade D \n");
            }
            else{
                System.out.println("Fail");
            }
        }
    }

