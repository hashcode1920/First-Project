import java.util.Scanner;
public class SecToMin {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // System.out.print("Enter the Seconds: ");
            // float sec = sc.nextFloat();
            // float min = 60;
            // float mins = sec/min;
            // System.out.println("The conversion in mins: ");
            // System.out.println(mins);
            System.out.println("Enter the Seconds: ");
            float sec = sc.nextFloat();
            float hours = sec/86400;
            System.out.println("After converting to sec to hour the hour is: ");
            System.out.println(hours);
        }
    }

