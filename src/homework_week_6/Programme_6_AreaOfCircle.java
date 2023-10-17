package homework_week_6;

import java.util.Scanner;

/**
 *  enter any radius value of the circle and find out the area
 *  .(Formula of Area A=PI*r*r)
 */
public class Programme_6_AreaOfCircle {

    /**
     * function takes in a value of radius
     * and it does a calculation
     * and then outputs the area which is found by doing the calculation
     * forumla is pi times r times r
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius: " );
        Double radius = sc.nextDouble();
        Double area = radius * radius * Math.PI;
        System.out.println("Here is the area: " + area);
        sc.close();
    }
}
