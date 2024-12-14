import java.util.Arrays;
import java.util.Scanner;

/**
 * A program that checks if two given words are anagrams.
 * An anagram contains the same letters in a different order.
 */
public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        if (areAnagrams(word1, word2)) {
            System.out.println("The words are anagrams.");
        } else {
            System.out.println("The words are not anagrams.");
        }
    }

    /**
     * Helper method to check if two words are anagrams.
     */
    public static boolean areAnagrams(String word1, String word2) {
        char[] array1 = word1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] array2 = word2.replaceAll("\\s", "").toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
