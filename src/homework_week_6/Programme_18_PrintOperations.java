package homework_week_6;

/**
 * Print the sum(addition),multiply, subtract, divide and remainder of two numbers
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Programme_18_PrintOperations {
    public static void main(String[] args) {
        int number1 = 125;
        int number2 = 24;
        System.out.println("Expected Output:");


        int sum = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        int remainder = number1 %number2;

        System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
        System.out.println(number1 + " * " + number2 + " = " + multiplication);
        System.out.println(number1 + " / " + number2 + " = " + division);
        System.out.println(number1 + " mod " + number2 + " = " + remainder);

    }

}
