/**
 * Problem 8: Write a java program to read two integer value from the user and to print weather those two entered number are 
            equal or not?

 * Input Format: Enter numbers: num1 (first number)
                                num1 (second number)
 * Output Format: Equal/Not equal
 * Sample Input 1 : Enter number: 5
                               5
 * Sample Output: Equal.
 * Sample Input 2 : Enter number: 4
                                  6
 * Sample Output: Not equal.   
 */
package local.tilde.raghusir.brachingconstrolstatement;

import java.util.Scanner;

public class TwoValuesEqualOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num1 == num2) {
            System.out.println("Equal.");
        } else {
            System.out.println("Not equal.");
        }
        scan.close();
    }
}
