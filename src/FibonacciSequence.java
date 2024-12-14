import java.util.Scanner;

/**
 * A program that generates and displays the first n numbers
 * in the Fibonacci sequence.
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms to display: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
