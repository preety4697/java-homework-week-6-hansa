package homework_week_6;
/**
 * Swap two variables
 */
public class Programme_15_SwapTheValue {
    public static void main(String[] args) {

      //Declare and initialize two variables
      int a  = 5;
      int b = 10;

      System.out.println("Before swapping:");
      System.out.println("a = " + a);
      System.out.println("b = " + b);

      //swap the value of 'a' and 'b' using a temporary variable
      int temp = a;
      a = b;
      b = temp;

      //After swapping
      System.out.println("After swapping:");
      System.out.println("a = " + a);
      System.out.println("b = " + b);


    }
}
