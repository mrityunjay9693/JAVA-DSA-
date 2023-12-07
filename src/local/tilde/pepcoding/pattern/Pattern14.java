/*
 *  Problem: Pattern 14.
             You are given a number "n".
             You have to write codeto prints its multiplicatin table upto 10 in the format given below:
    Constraints: 1 <= n <= 10
    Output: n * 1 = n
            n * 2 = 2n
            n * 3 = 3n
            n * 4 = 4n 
            ---------
            ---------
            n * 10 = 10n
 */
package local.tilde.pepcoding.pattern;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = scan.nextInt();
        System.out.println("Pattern: ");
        
        for (int i = 1; i <= 10; i++) {
            int prod = n * i;
            System.out.println(n +"*" +i +"="+" "+prod);
        }
        scan.close();
    }
}
