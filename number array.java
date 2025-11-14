import java.util.Scanner;

public class InteractiveExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean arrayError = false;
        boolean mathError = false;

        // Part 1: Array out-of-bounds exception
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array has 5 elements (indices 0 to 4). Try to access one!");
        System.out.print("Enter the index you want to access: ");

        try {
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + " is: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: That index doesn't exist in the array!");
            arrayError = true;
        }

        System.out.println("\nNow let's try a math problem...");

        // Part 2: Divide by zero exception
        System.out.print("Enter a number to divide 10 by: ");
        try {
            int divisor = scanner.nextInt();
            int result = 10 / divisor;
            System.out.println("10 divided by " + divisor + " is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            mathError = true;
        }

        // Final message
        if (arrayError || mathError) {
            System.out.println("\nThe program caught some errors but closed without crashing. Nice job!");
        } else {
            System.out.println("\nNo errors occurred, but the program still ran safely.");
        }

        scanner.close();
    }
}
