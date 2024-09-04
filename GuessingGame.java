
import java.util.Scanner;

public class GuessingGame {

    public static int val1 = 0;
    public static int val2 = 0;
    public static void main(String[] args) {
        
        RandomNumber();
        UsersGuess();

        System.out.println("Computers Random Number: " + val1);
        System.out.println("User's Guess: " + val2);

        IfEqual();
        
    }
    public static void RandomNumber(){

        int min = 1;
        int max = 10;
        val1 = (int) (Math.random() * (max - min + 1) + min);

    }
    public static void UsersGuess() {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Guess a Number from 1 to 10: ");
        val2 = reader.nextInt();

    }
    public static void IfEqual(){

        if(val1 == val2){

            System.out.println("They are Equal you Win!");

        }
        else{

            System.out.println("They are not equal, Try again: ");
            TryAgain();

        }

    }
    public static void TryAgain(){

        RandomNumber();
        UsersGuess();

        System.out.println("Computers Random Number: " + val1);
        System.out.println("User's Guess: " + val2);

        IfEqual();
        System.out.print("");

    }


}
