/**
 * Problem: Write a java program to read a side of square from the user and print the area and perimeter of square.
 * print in followingformat:
 * Input Format: Enter side: n (any number) 
 * Output Format:Area of square: area (any number, area of square)
                 Perimeter of square: c (any number, perimeter of square)
 * Sample Input: Enter side: 12
 * Sample Output: Area of square: 144 
                  Perimeter of square: 48
                     
 * Formulae for Area of square is : side * side (read as : side suare)
 * Formulae for Perimeter of square is : 4 * side (read as : 4 into side) 
 */
package local.tilde.raghusir.basic;

import java.util.Scanner;

public class AreaPerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side: ");
        int side = scan.nextInt();
        System.out.println("Area of square: " + (side * side));
        System.out.println("Perimeter of square: " + (4 * side));
        scan.close();
    }
}
