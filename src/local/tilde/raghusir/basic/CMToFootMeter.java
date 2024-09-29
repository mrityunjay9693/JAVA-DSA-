/**
 * Problem: Write a java program to read a length of a pipe from the user in 'cm'and print the length in 'foot' and 'meter'.
 * print in followingformat:
 * Input Format: Enter length: n (any number) 
 * Output Format:length in foot: area (any number, area of square)
                 length of meter: c (any number, perimeter of square)
 * Sample Input: Enter side: 12
 * Sample Output: Area of square: 144 
                  Perimeter of square: 48
                     
 * You have to take input from user as length of pipe in cm and then convert it to foot and in meter and print it.
 * 1 meter : 100 cm
 * 1 foot : 30.48 sm
 */
package local.tilde.raghusir.basic;

import java.util.Scanner;

public class CMToFootMeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length in cm : ");
        double length = scan.nextDouble();
        System.out.println("In meter: "+(length/100));
        System.out.println("In foot: "+(length/30.48));
        scan.close();
    }
}
