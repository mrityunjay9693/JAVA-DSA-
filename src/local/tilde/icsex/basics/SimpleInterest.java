/*
 * Problem Statement : Write a program to input the Principal, Rate, and Time and calculate the simple interest.
 * Simple Interest : (Principal * Rate * Time)/100 
 */

package local.tilde.icsex.basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Principal : ");
        float Principal = scan.nextFloat();

        System.out.println("Enter Rate : ");
        float rate = scan.nextFloat();

        System.out.println("Enter Given Time : ");
        float time = scan.nextFloat();

        float SimpleInterest = (Principal * rate * time) / 100;

        System.out.println("Simple Interest : " + SimpleInterest);

        scan.close();
    }
}
