import java.util.Scanner;
import java.util.Random;
public class NumberGame{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxrange = 100;
        int attempts = 4;
        int score = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        do{
            int randomNumber = random.nextInt(maxrange-minRange + 1)+ minRange;
            System.out.println("\nI've picked a number between"+ minRange + "and"+ maxrange + ".Guess it!");
            for(int attempt = 1;attempt <= attempts;attempt++){
                System.out.print("Attempt" +attempt+"-Enter your guess:");
                int userGuess = sc.nextInt();
                if(userGuess == randomNumber){
                    System.out.println("Congratulations!You guessed it right in" + attempt +"attempts.");
                    score += attempts-attempt+1;
                    break;
                }
                else if(userGuess < randomNumber){
                    System.out.println("Too low.Try again!");
                }
                else{
                    System.out.println("Too high.Try again!");
                }
                if(attempt == attempts){
                    System.out.println("Oops!You've exhausted all attempts.The number was:"+randomNumber);
                }
            }
            System.out.print("Do you want to play again?(yes/no):");
            String playAgain = sc.next();
            if(playAgain.equalsIgnoreCase("no")){
                break;
            }
        }while(true);
        System.out.println("Your total score is:"+score);
        System.out.println("Thanks for playing!");
    }
}