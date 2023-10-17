package homework_week_6;

import java.util.Scanner;
/**
 * Converts a Decimal number to binary number
 * Input a Decimal Number:5
 * Binary Number is:101
 */

public class Programme_17_DecimalToBinary {
    public static void main(String[] args) {
        //Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter a decimal number
        System.out.println("Input a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        // convert the decimal number to binary
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        //Display the binary equivalent
        System.out.println("Binary number is: " + binaryNumber);
    }
}











