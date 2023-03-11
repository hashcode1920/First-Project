import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //0 is Rock,
        //1 is Paper and
        //2 is Scissor.

        System.out.print("Select 0 for Rock, 1 for Paper, 2 for Scissor: ");
        int userInput = sc.nextInt();

        Random anyNumber = new Random();
        int computerInput = anyNumber.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Draw");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Win.");
        }
        if(computerInput == 0){
            System.out.println("Computer Choice: Rock");
        }
        else if (computerInput == 1){
            System.out.println("Computer Choice: Paper");
        }
        else if(computerInput == 2){
            System.out.println("Computer Choice: Scissor");
        }
    }
}
