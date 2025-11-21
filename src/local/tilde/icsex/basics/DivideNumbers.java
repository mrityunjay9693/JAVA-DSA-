/*
 * Problem Statement : Write a program to pass 2 integer numbers as parameters. If either of the two numbers is 0,
   display "Invalid Input. Try again!" and the program should end, if it is valid entry, divide the larger number
   with the smaller number and display the result. 
 */

package local.tilde.icsex.basics;

import java.util.Scanner;

public class DivideNumbers {
    public static void divideNumbers(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Invalid Input. Try again!");
        } else {
            if (num1 > num2) {
                float result = (float)num1 / num2;
                System.out.println("Result: " + result);
            } else {
                float result = (float) num2 / num1;
                System.out.println("Result: " + result);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scan.nextInt();

        //DivideNumbers dn = new DivideNumbers();
        //dn.divideNumbers(num1, num2);
        divideNumbers(num1, num2);
        scan.close();
    }
}
