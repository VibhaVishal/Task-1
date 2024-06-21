import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[]args) {
        Random ra = new Random();
        int numberToGuess = ra.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempts = 0;
        System.out.println("Welocome to the number guessing game!");
        System.out.println("Guess a number between 1 and 100:");

        while(true) {
            guess = sc.nextInt();
            attempts++;

            if(guess == numberToGuess) {
                System.out.println("Conguratulations, you guessed the number!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. try again:");
            } else {
                System.out.println("Your guess is too high. try again:");
            }
        }
        System.out.println("Total attempts:" + attempts);
    }
}
