package homework_week_6;

import java.util.Scanner;

/** Multiplication table for a number
 *
 */
public class Programme_10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table for  " + number + ";");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + "  = " + result);
            scanner.close();

        }
    }
}
