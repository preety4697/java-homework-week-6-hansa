package homework_week_6;

import java.util.Scanner;

/**
 *  calculate the area of a triangle.
 * Getting area of triangle from given width and height
 */
public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a width: ");
        Double w = sc.nextDouble();
        System.out.println("Enter a height: ");
        Double h = sc.nextDouble();
        Double area = w * h * 0.5;
        System.out.println("area: " + area);
        sc.close();


    }
}
