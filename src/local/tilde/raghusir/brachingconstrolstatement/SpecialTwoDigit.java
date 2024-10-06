/**
 * Problem 13: Write a java program to read a integer value from the user and to print weather the given integer value is 
               special two digit number or not.

 * Special Two Digit: Special two digit number is such number whose sum of digits is addded to the product of its digit, the
                      result is equal to the original number.
                      Example: num1 = 59
                               (5 * 9) + (5+9) = 4 + 15 = 59
 * Constraints : Only two digit is allowed to check.

 * Input Format: Enter numbet: num (first number)
 * Output Format: num is a special digit.
 
 * Sample Input 1 : Enter two-digit number: 59
 * Sample Output: Biggest number: 59 is a Special 2-Digit Number.
 */
package local.tilde.raghusir.brachingconstrolstatement;

import java.util.Scanner;

public class SpecialTwoDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter two-digit number: ");
        int num = scan.nextInt();
        
        int digit1 = num/10;
        int digit2 = num%10;
        
        int sum = (digit1*digit2) + (digit1+digit2);
        if(sum == num){
            System.out.println(num+" is a Special 2-Digit Number");
        }else{
            System.out.println(num+" is not a Special 2-Digit Number");
        }
        scan.close();
    }
}
