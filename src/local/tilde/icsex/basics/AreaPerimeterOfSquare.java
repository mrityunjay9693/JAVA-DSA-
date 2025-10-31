/**
 * Problem Statement : Write a program using float type variable to find the area and perimeter of a square whose side is 12.5
 */

package local.tilde.icsex.basics;

public class AreaPerimeterOfSquare {
    public static void main(String[] args) {
        float sideOfSquare = 12.5f;

        float areaOfSquare = (sideOfSquare * sideOfSquare);
        float perimeterOfSquare = (4 * sideOfSquare);

        System.out.println("Area : " + areaOfSquare);
        System.out.println("Perimeter : " + perimeterOfSquare);
    }
}
