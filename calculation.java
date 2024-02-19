import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        // Read the first number entered by the user
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        // Read the second number entered by the user
        double num2 = scanner.nextDouble();

        // Display a menu for selecting the operation
        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        // Read the operation selected by the user
        int operation = scanner.nextInt();

        double result;

        // Perform the selected operation
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                // Check if the second number is not zero before performing division
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }

        // Close the Scanner to release system resources
        scanner.close();
    }
}
