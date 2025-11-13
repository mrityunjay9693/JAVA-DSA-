/*
 *  Problem Statement : Write a program to input area of square and find its perimeter. 
 */

package local.tilde.icsex.basics;

import java.util.Scanner;

public class AreaAndPerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter area of square: ");
        double area = scan.nextDouble();
        System.out.println("Perimeter: " + 4 * (Math.sqrt(area)));

        scan.close();
    }
}
