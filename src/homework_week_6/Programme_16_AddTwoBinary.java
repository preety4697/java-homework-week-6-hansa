package homework_week_6;
/** Add two binary numbers
 * Input first binary number:10
 * Input first binary number:11
 * Sum of two binary numbers:101
 */

import java.util.Scanner;

public class Programme_16_AddTwoBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.println("Input second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert binary strings to decimal integers
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        // Add the decimal numbers
        int sum = decimal1 + decimal2;

        // Convert the sum back to binary
        String binarySum = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers: " + binarySum);


    }
}
