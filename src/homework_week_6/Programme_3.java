package homework_week_6;

public class Programme_3 {
     String name = "India"; // Instance variable
     static int number = 25; // static variable

     // m1 is a Instance method
     public void m1() {
         System.out.println("m1: " + name);
     }
     // m2 is a static method
     public static void m2() {
         // Instance and static variables into both instance and static method
         Programme_3 obj = new Programme_3(); //create instance method
         System.out.println("m2: " + number);
    }
    // Declare the main method
    public static void main(String[] args){
         // Call instance and static method into main method
        Programme_3 obj = new Programme_3();
        obj.m1(); // Instance method
        obj.m2(); //Static method
      }
  }

