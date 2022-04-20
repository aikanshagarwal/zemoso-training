package LDPJava1;
import java.util.Scanner;
import java.util.Random;
public class ProjectGuess
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        int random = ra.nextInt(100)+1;
        int noguesses=0;
        int guess;
        boolean win = false;

        while(win==false)
        {
            System.out.println("Guess the number:");
            guess = sc.nextInt();
            noguesses++;
            if(guess>=1 && guess<=100)
            {
                if(guess>random)
                {
                    System.out.println("Your guess was too high , try again.");

                }
                else if(guess<random)
                {
                    System.out.println("Your guess was too low , try again.");

                }
                else
                {
                    System.out.println("Congratulations , you guessed the number in " + noguesses + " guesses. ");
                    win = true;
                }
            }
            else
            {
                System.out.println("You need to enter number between 1 and 100 inclusive.");
                noguesses--;
            }

        }

    }





}
