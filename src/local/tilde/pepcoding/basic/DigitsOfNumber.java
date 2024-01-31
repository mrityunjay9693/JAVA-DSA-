/*
 Problem : Digits Of A Number.
 1.You have to display the digits of a number
 2.Takes "n" as input, the input number from user for which digits have to be displayed.
 3.Print the digits of the number line-wise.
 Constraints : 1 <= n <= 10^9
 Format : Input = n, Where n is any integer value.
 Output = d1
          d2
          d3....dn digits of the number.
 Sample Input: 65784 (n : input value)
 Sample Output: 6
                5
                7
                8
                4
 */
package local.tilde.pepcoding.basic;

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] ars) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Eneter number: ");
        int n = scan.nextInt();
        int copyOfN = n;

        int temp = 1;
        while (copyOfN > 9) {
            copyOfN = copyOfN / 10;
            temp = temp * 10; // temp : 10, 100, 1000,.. 
        }

        while (temp != 0) {
            int digit = n / temp; // d : d1, d2, d3, ... dn
            System.out.println(digit);
            n = n % temp; // getting new number : eg : n = 1234 and temp=1000 -> 1234%1000 = 234 in this way
            temp = temp/10; // 1000, 100, 10, 1, 0
        }
        scan.close();
    }

}
