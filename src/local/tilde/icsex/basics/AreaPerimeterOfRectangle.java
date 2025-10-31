/**
 * Problem Statement : Write a program using int variables to find the area and perimeter 
                       of a rectangle of length 12cm and breadth 8cm
 */

package local.tilde.icsex.basics;

public class AreaPerimeterOfRectangle {
    public static void main(String[] args) {
        int length = 12;
        int breadth = 8;

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
