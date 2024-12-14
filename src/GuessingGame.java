import java.util.Random;
import java.util.Scanner;

/**
 * A simple number guessing game.
 * The program randomly selects a number between 1 and 50,
 * and the user must guess the number.
 */
public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(50) + 1;
        int guess;

        System.out.println("Guess the secret number (between 1 and 50):");

        do {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number!");
            } else {
                System.out.println("Wrong guess. Try again.");
            }
        } while (guess != secretNumber);
    }
}
