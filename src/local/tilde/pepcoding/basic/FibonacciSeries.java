/** 
 *Problem:Print Fibonacci Series Till N
          1. You've to first n fibonacci numbers..
          2. Take a value "n" from user as input, representing the count of fibonacci numbers to print.
          3. Print first "n" fibonacci numbers.
 *First two numbers of the series are fixed i.e., 0 and 1.
 *Constraints:1 <= n < 40.
 *Format: input : n(any integer value)
          output : 0, 1, 1, 2, 3, 5, 8, ... first n fibonacci 
 *Sample Input: 10 (n : integer representing total fibonacci numbers to be print)       
 *Sample output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34. 
              
 */
package local.tilde.pepcoding.basic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();

        int first_number = 0;
        int second_number = 1;
        int i = 1;
        while (i <= n) {
            int next_number = first_number + second_number;
            
            System.out.print(first_number);
            System.out.print("\t");
            
            first_number = second_number;
            second_number = next_number;

            i++;
        }
        scan.close();
    }
}