import java.util.*;

public class loops {

    public static void main(String args[]){

        //LOOPS FOR, WHILE AND DO WHILE:
        //For:
        //counter++ => counter = counter + 1: Increment operator in Java.
        /*for(int i = 0; i < 11; i++){
            System.out.print(i+"");
        }*/
        //While:
        /*int i = 0;
        while(i < 11){
            System.out.println(i);
            i = i + 1;
        }*/
        //DO WHILE:
        /*int i = 0;
        do{
            System.out.println(i);
            i = i +1;
        } while(i < 6);
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<11; i++){
            System.out.println(i*n);
        }

    }

}
