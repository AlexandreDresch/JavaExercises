import java.util.Scanner;

/**
 * A program that checks if a given word is a palindrome.
 * A palindrome reads the same forwards and backwards, ignoring case.
 */
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String normalizedWord = word.replaceAll("\\s", "").toLowerCase();
        String reversedWord = new StringBuilder(normalizedWord).reverse().toString();

        if (normalizedWord.equals(reversedWord)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }
}
