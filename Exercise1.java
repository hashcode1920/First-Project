import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
    int inputUser;
    int noOfGuesses = 0;
    int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

   Game(){
       Random rand = new Random();
       this.number = rand.nextInt(100);
   }
   public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        inputUser = sc.nextInt();
   }
   public boolean isCorrectNumber(){
        noOfGuesses++;

        if(inputUser == number){
            System.out.format("Yes you have guessed it right, it was %d \n You guessed it in %d attempts.", number, noOfGuesses);
            return true;
        }
        else if (inputUser < number) {
            System.out.println("To less..");
            System.out.println("Guess Again: ");
            return  false;
        }
        else if(inputUser > number){
            System.out.println("To High..");
            System.out.println("Guess Again: ");
        }
       return false;
   }
}
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Guess The Number: ");
        Game g = new Game();
        boolean b = false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
