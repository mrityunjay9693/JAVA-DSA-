/*
 Problem :Pattern 1.
          1.You are given a number "n" as input.
          2.You have to create a pattern of "*" and then separated by tab as shown 
            in the output format.
 Constraints : 1 <= n <= 100
 Format : Input = n, Where n is any integer value.
 Output = *
          * *
          * * *
          * * * *
          * * * * * 
          .
          .
          nth*......nth*

 Sample Input: 5 (n : input value)
 Sample Output: *
                * * 
                * * *
                * * * *
                * * * * * 
 */

package local.tilde.pepcoding.pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("Enetr n: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int row = 1; row <= n; row++) {
            int noOfStar = row;
            for (int i = 1; i <= noOfStar; i++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        scan.close();
    }
}
