/*
 * Problem Statement: Digit Frequency
                      1.You are given a number "num" as input value in number type.
                      2.You are given any digit of input value num in "digit".
                      3.You are required to calculate the frequency of the digit in number "num".

 * Constraints: 0 <= num <= 10^9 , 0 <= digit <=9
 * Input format : num (any integer number value)
                  digit(any digit given from num)
 * Output format: f (A number representing frequency of digit "digit" in the number "num")
 * Sample Input : 994543234 (num)
                  4 (digit)
 * Sample Output : 3 (3 is the frequency of 4 in num i.e., three number of time 4 appears in 994543234)
 */

package local.tilde.pepcoding.function;

import java.util.Scanner;

public class DigitFrequency {

    public static int frequencyOfDigit(int num, int digit) {
        int f = 0;
        while (num != 0) {
            int rem = num % 10;
            if (rem == digit) {
                f++;
            }
            num = num / 10;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Eneter number: ");
        int num = scan.nextInt();
        System.out.println("Eneter digit for counting its frequency: ");
        int digit = scan.nextInt();
        System.out.println("Frequency of "+digit+" : "+frequencyOfDigit(num, digit));
        scan.close();
    }
}
