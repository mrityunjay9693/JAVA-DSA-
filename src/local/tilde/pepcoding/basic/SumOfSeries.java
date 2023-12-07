/**
 *  Problem:Sum of series 1 to n:
            Write a program in java to take a number "n"(integer) as input and print sum of following series:
            Series:  1 + 2 + 3 + 4 + 5 + 6 + 7 + ------ + n.
            Here, n = any integer, input from user.
    Task:   You have to print the sum of series given above(from 1 to n).
    Input : 10 
    Output: 55 [1+2+3+4+5+6+7+8+9+10 = 55]    
 */
package local.tilde.pepcoding.basic;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = scan.nextInt();
        // int sum = 0;

        // for (int i = 1; i <= n; i++) {
        // sum += i;
        // }
        // System.out.println("Sum of series 1 to n: "+sum);
        int sumOfSeries = (n * (n + 1)) / 2;
        System.out.println("Sum of series 1 to n: " + sumOfSeries);
        scan.close();
    }
}
