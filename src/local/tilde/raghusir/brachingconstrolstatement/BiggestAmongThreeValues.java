/**
 * Problem 15: Write a java program to read three integer value from the user and to print biggest number among them by 
 *             using simple if statement.

 * Input Format:Enter first number: num1 (first number)
                Enter second number: num2 (second number)
                Enter third number: num2 (second number)
 * Output Format: num1/num2/num3
 * Sample Input 1 : Enter first number: 4
                    Enter second number: 7
                    Enter third number: 3
 * Sample Output:   Biggest number: 7 (num2)
 */
package local.tilde.raghusir.brachingconstrolstatement;

import java.util.Scanner;

public class BiggestAmongThreeValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scan.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Biggest number: " + num1);
            } else {
                System.out.println("Biggest number: " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("Biggest number: " + num2);
        } else {
            System.out.println("Biggest number: " + num3);
        }
        scan.close();
    }
}
