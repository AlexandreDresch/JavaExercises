import java.util.Scanner;

/**
 * A program that counts the number of words in a given sentence.
 * Words are assumed to be separated by spaces.
 */
public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.trim().split("\\s+");

        System.out.println("Number of words: " + words.length);
    }
}
