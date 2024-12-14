import java.util.Scanner;

/**
 * A simple calculator program that takes two numbers and an operator
 * (+, -, *, /) from the user and performs the requested operation.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean isValidOperation = true;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Error: Division by zero.");
                    isValidOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                isValidOperation = false;
        }

        if (isValidOperation) {
            System.out.println("Result: " + result);
        }
    }
}
