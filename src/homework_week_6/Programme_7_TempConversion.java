package homework_week_6;

import java.util.Scanner;

public class Programme_7_TempConversion {
    /** takes in a value of temperature
     * does a calculation to convert into Celsius by doing the following formula
     * Celsius = (Fahrenheit - 32) * 5/9
     * output the Celsius
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature in fahrenheit: ");
        Double F = sc.nextDouble();
        Double C = (F - 32.0) * 5.0/9.0;
        System.out.println("This is that temperature in Celsius: " + C);
        sc.close();
    }
}
