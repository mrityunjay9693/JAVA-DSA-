/**
 * Problem 2: Write a java program to read radius from the user and calculate the area and circumference of cirecle.
              print in followingformat:
 * Input Format: Enter radius: n (any number) 
 * Output Format:Area of circle: a (any number, area of circle)
                 Circumference of circle: c (any number, circumference of circle)
 * Sample Input: Enter radius: 5
 * Sample Output: Area of circle: 78.5 
                  Circumference of circle: 31.400000000000002
                     
 * Formulae for Area of circle is : pie * radius * radius (read as : pie r square)
 * Formulae for Circumference of circle is : 2 * pie * radius (read as : two pie r) 
 */

package local.tilde.raghusir.basic;

import java.util.Scanner;

public class AreaCircumferenceOfCirecle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scan.nextDouble();
        System.out.println("Area of circle: " + (3.14 * radius * radius));
        System.out.println("Circumference of circle: " + (2 * 3.14 * radius));
        scan.close();
    }
}
