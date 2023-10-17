package homework_week_6;
/** Java program that takes three numbers as input to calculate and
 print the average of the numbers.
 */

import java.util.Scanner;

public class Programme_13_AverageOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Make the user to enter three numbers
        System.out.println("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        double number2 = input.nextDouble();

        System.out.println("Enter the third number: ");
        double number3 = input.nextDouble();

        // Calculate the average
        double average = (number1 + number2 + number3) / 3;

        //Print the result
        System.out.println("The average of three number is : " + average);
        input.close();
    }
}


