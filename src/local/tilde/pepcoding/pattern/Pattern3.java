/*
 Problem :Pattern 3.
          1.You are given a number "n" as input.
          2.You have to create a pattern of "*" and then separated by tab as shown 
            in the output format.
 Constraints : 1 <= n <= 1000
 Format : Input = n, Where n is any integer value.
 Output format:                 *
                            *   *
                        *   *   *
                    *   *   *   *
                *   *   *   *   *    

 Sample Input: 4 (n : input value)
 Sample Output:             *
                        *   *
                    *   *   *
                *   *   *   * 
 */

package local.tilde.pepcoding.pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        System.out.println();

        for (int row = 1; row <= n; row++) {
            // Space
            int space = n - row; // n = 5, row = 1 ; space = n - row => space = 5 - 1 = 4
            for (int i = 1; i <= space; i++) {
                System.out.print(" \t");
            }
    
            // Star
            for (int i = 1; i <= row; i++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        scan.close();
    }
}
