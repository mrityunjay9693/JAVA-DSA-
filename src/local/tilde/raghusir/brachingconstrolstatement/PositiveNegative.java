/**
 * Problem: Write a java program to read a number from the user and to print weather the entered number is 
            positive or negative
 * print in followingformat:
 * Input Format: Enter number: num (any number) 
 * Output Format: Negative/Positive
 * Sample Input: Enter number: 5
 * Sample Output: Positive   
 * Formulae for Area of circle is : pie * radius * radius (read as : pie r square)
 * Formulae for Circumference of circle is : 2 * pie * radius (read as : two pie r) 
 */

package local.tilde.raghusir.brachingconstrolstatement;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.print("Positive.");
            System.out.println();
        } else if (num == 0) {
            System.out.print("Zero");
            System.out.println();
        } else {
            System.out.print("Negative");
            System.out.println();
        }
        scan.close();
    }
}
