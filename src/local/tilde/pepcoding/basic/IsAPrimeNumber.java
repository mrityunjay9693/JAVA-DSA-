/** 
 *Problem:Is A Prime Number
          1. You've to check whether a given number is prime or not.
          2. Take a number "t" as input representing count of input numbers to be tested.
          3. Take a number "n" as input "t" number of times.
          4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
 *Constraints:1 <= t <= 10000
                2 <= n < 10^9
 *Input:t [integer representing count of numbers to be tested]
        n1
        n2
        n3
        n4
        n5
 *output:prime
         prime
         prime
         not prime 
         prime   
 */
package local.tilde.pepcoding.basic;

import java.util.Scanner;

public class IsAPrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Eneter number of test case:");
        int t = scan.nextInt();

        for (int j = 1; j <= t; j++) {
             int numbers = scan.nextInt();
            int flag = 1; // 1 -> prime
            if (numbers == 1) {
                System.out.println("Invalid test case.");
                break;
            }
            for (int i = 2; i * i < numbers; i++) {
                if (numbers % i == 0) {
                    flag = 0; // 0 -> not prime
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
        scan.close();
    }
}
