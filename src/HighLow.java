/*
 * Build a high-low guessing game. Game picks a random number between 1
 * and 100. Prompts the user to guess the number, all user inputs are
 * validated. If the guess is less than the number, it outputs "HIGHER",
 * reverse for "LOWER".
 * Use the random method of the java.lang.Math class to generate a
 * random number.
 * */

import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);

        System.out.println("Pick a number between 1 and 100");

        int userGuess = sc.nextInt();

        do {
            if (userGuess < randomNumber) {
                System.out.println("Higher!");
                userGuess = sc.nextInt();
            } else if (userGuess > randomNumber) {
                System.out.println("Lower!");
                userGuess = sc.nextInt();
            }

        } while (userGuess != randomNumber);
        System.out.println("Good guess!");
    }
}
