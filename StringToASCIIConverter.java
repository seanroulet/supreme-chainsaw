import java.util.Scanner;

public class StringToAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word or phrase to convert to an ASCII string:");
        String userInput = scanner.nextLine();

        System.out.print("Your ASCII string is: ");

        // --- Your code goes below ---

        // TODO: Create a for loop to iterate through each character of the userInput string.

            // Inside the loop:
            // 1. Get the character at the current index.
            // 2. Cast the character to an integer to get its ASCII value.
            // 3. Use if-statements to ensure the ASCII value is always printed as 3 digits.
            //    - If the value is less than 10, you must print "00" before the number.
            //    - If the value is between 10 and 99 (less than 100), you must print "0" before the number.
            // 4. Print the resulting number/string WITHOUT a newline. Use System.out.print().

        // --- Your code goes above ---

        System.out.println(); // Print a final newline for clean formatting
        scanner.close();
    }
}
