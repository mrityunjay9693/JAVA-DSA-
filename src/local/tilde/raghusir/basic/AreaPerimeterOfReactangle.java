/**
 * Problem: Write a Java program to read length and breadth of a reactangle from the user and print area and perimeter 
   of the reactangle
 * Input Format: Enter length: length (any number)
                 Enter breadth: breadth (any number) 
 * Output Format:Area of reactangle: area (any number, area of circle)
                 Perimeter of reactangle: perimeter (any number, circumference of circle)
 * Sample Input: Enter length: 5 (any number)
                 Enter breadth: 4 (any number)
 
 * Sample Output: Area of reactangle:  18
                  Perimeter of reactangle: 20
   
 * 
 */
package local.tilde.raghusir.basic;

import java.util.Scanner;

public class AreaPerimeterOfReactangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = scan.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = scan.nextInt();
        // int area = 2*(length+breadth);
        // int perimeter = (length*breadth);
        System.out.println("Area of reactangle: " + (2 * (length + breadth)));
        System.out.println("Perimeter of reactangle: " + (length * breadth));
    }
}
