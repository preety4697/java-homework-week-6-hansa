package homework_week_6;

public class Programme_1 {
    //declare two instance variables
    int b = 5;
    String name = "Hello Inst";


    //declare two instance method
public void printProgramme_1() {
        // Call both instance variable into instance method
        System.out.println("Instance Variable 1: " + b);
        System.out.println("Instance Variable 2: "  + name);
    }
       //Declare the main method
public static void main(String[] args) {
       // Create an instance of the class
       Programme_1 obj = new Programme_1();

        // two Instance method in main method
       obj.printProgramme_1();

    }


}
