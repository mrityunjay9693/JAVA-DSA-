/**
 * Problem 9: Write a java program to read two integer value from the user and to print biggest number among them.

 * Input Format: Enter first number: num1 (first number)
                 Enter second number: num2 (second number)
 * Output Format: num1/num2/Both Numbers are equal.
 * Sample Input 1 : Enter first number: 4
                    Enter second number: 3
 * Sample Output: Biggest number: 4 (num1)
 * Sample Input 2 : Enter first number: 3
                    Enter second number: 6
 * Sample Output: Biggest number: 6 (num2)
 * Sample Input 2 : Enter first number: 3
                    Enter second number: 3
 * Sample Output: Biggest number: Both Numbers are equal.
 */
package local.tilde.raghusir.brachingconstrolstatement;

import java.util.Scanner;

public class BiggestNumberAmongTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.println("Both Numbers are equals.");
        } else if (num1 > num2) {
            System.out.println("Biggest number: " + num1);
        } else {
            System.out.println("Biggest number: " + num2);
        }
        scan.close();
    }
}
