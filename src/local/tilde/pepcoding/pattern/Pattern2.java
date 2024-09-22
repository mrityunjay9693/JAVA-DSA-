/*
 Problem :Pattern 1.
          1.You are given a number "n" as input.
          2.You have to create a pattern of "*" and then separated by tab as shown 
            in the output format.
 Constraints : 1 <= n <= 1000
 Format : Input = n, Where n is any integer value.
 Output = nth*......nth*
          .
          .
          * * * * *
          * * * * 
          * * *
          * * 
          *  

 Sample Input: 5 (n : input value)
 Sample Output: * * * * *
                * * * * 
                * * *
                * * 
                * 
 */

package local.tilde.pepcoding.pattern;

import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any integer(1-1000): ");
        int n = scan.nextInt();
        for(int row = 1; row <= n; row++){
            int star = (n-row)+1; //n=5, star = (n-row)+1 = (5-1)+1 = (4)+1 = 5
            for(int i=1; i <= star; i++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        scan.close();
    }
}
