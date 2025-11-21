/*
 * Problem Statement : Write a program to input length and breadth of rectangle and find its diagonal.
 * Diagonal = ((length*length) + (breadth*breadth))
 */

package local.tilde.icsex.basics;

import java.util.Scanner;

public class DiagonalOfRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Length: ");
        double length = scan.nextDouble();

        System.out.println("Enter Breadth: ");
        double breadth = scan.nextDouble();

        double diagonal = Math.sqrt((length * length) + (breadth * breadth));
        System.out.println("Diagonal of Rectangle: " + diagonal);

        scan.close();
    }
}
