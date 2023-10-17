package homework_week_6;

public class Programme_4 {
    // Declare two instance and two static variables
    String v1 = "Hello"; // Instance variable
    String v2 = "Friend"; // Instance variable
    int a = 30; // Static variable
    int b = 40; // Static variable

    // Declare one instance method (m1 is instance method)
    public void m1(){
        // Call all four instance and static variables into instance method
        System.out.println("Inside m1 method:");
        System.out.println("Instance Variable 1: " + v1);
        System.out.println("Instance Variable 2: " + v2);
        System.out.println("Static Variable 1: "+ a);
        System.out.println("Static Variable 2: " +b);
    }
    // Declare one static method (m2 is static method)
    public void m2() {
        // Call all four instance and static variables into static method
        System.out.println("Inside m2 method");
        Programme_4 obj = new Programme_4();
        System.out.println("Instance Variable 1: " + v1);
        System.out.println("Instance Variable 2: " + v2);
        System.out.println("Static Variable 1: " + a);
        System.out.println("Static Variable 2: " + b);
    }
    // Declare the main method
    public static void main(String[] args) {
        // Call both instance and static methods into main method
        System.out.println("Inside main:");
        Programme_4 obj = new Programme_4();
        obj.m1();
        obj.m2();
    }
}
