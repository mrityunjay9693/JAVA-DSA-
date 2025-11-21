/*
 * Problem Statement : Write a program to input 2 integers and check whether both the numbers are multiples of 7 or not
 */

package local.tilde.icsex.basics;

import java.util.Scanner;

public class MultipleOfSeven {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 2 integers : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 % 7 == 0 && num2 % 7 == 0) {
            System.out.println(num1 + " and " + num2 + ", both are multiples of 7.");
        } else {
            System.out.println(num1 + " and " + num2 + ", both are not multiples of 7.");
        }
        scan.close();
    }
}
