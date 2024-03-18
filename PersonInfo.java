import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Prompt user to enter their address
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        // Display the entered information
        System.out.println("\n\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);

        // Close the scanner
        scanner.close();
    }
}
