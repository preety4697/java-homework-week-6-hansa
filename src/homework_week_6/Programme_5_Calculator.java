package homework_week_6;

import java.util.Scanner;

/**
 * Write a programme for a calculator with addition subtraction multiplication and division.
 * Methods all with parameters and use concatenation methods.
 * (Note: Two instance and two static methods.)
 */
public class Programme_5_Calculator {
     // Declare two static methods for addition and subtraction
    static String add (double num1, double num2){
       double result = num1 + num2;
       return num1 + " + " +num2 +"=" + result;
    }
    static String subtract(double num1, double num2){
       double result = num1-num2;
       return num1 + " - " +num2 +" = " + result;
    }
    //declare two instance methods for multiplication and division
    String multiply(double num1, double num2) {
        double result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }
    String divide(double num1, double num2){
        double result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
       //main method
    public static void main(String[] args) {
        // Create scanner object
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first number:");
        double number1= scanner.nextDouble();
        System.out.println("Enter the second number:");
        double number2 = scanner.nextDouble();

        //Create an object of the class
        Programme_5_Calculator calculator = new Programme_5_Calculator();
        // Call all the methods and print result
        System.out.println("Addition:" + add(number1, number2));
        System.out.println("Subtraction:" + subtract(number1, number2));
        System.out.println("Multiplication:" + calculator.multiply(number1, number2));
        System.out.println("Division:" + calculator.divide(number1,number2));

        //Close the scanner
        scanner.close();
    }
}

