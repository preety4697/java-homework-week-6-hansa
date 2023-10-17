package homework_week_6;

import java.util.Scanner;

/**Converting input into lowercase
 *
 */

public class Programme_9_ConvertUpperCaseToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some text:");
        String input = sc.nextLine();
        String Lowercase = input.toLowerCase();
        System.out.println("Lower case text:" + Lowercase);
        sc.close();
    }
}
