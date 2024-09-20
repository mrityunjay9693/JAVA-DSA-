/*
 * Problem Statement: Digit Frequency
                      1.You are given an array arr as input of size "s".
                      2.You are given any digit "digit".
                      3.You are required to calculate the frequency of the "digit" in the array arr.

 * Constraints: 0 <= num <= 10^9 , 0 <= digit <=9
 * Input format : "s"
                  n1, n2, n3, n4, n5, n6.... n (any integer number value)
                  digit (any digit given from array arr)
 * Output format: f (A number representing frequency of digit "digit" in the number array arr)
 * Sample Input : [9, 9, 4, 5, 4, 3, 2, 3, 4] (arr)
                  4 (digit)
 * Sample Output :3 (3 is the frequency of 4 in array arr i.e., three number of time 4 appears 
                  [9, 9, 4, 5, 4, 3, 2, 3, 4] (arr)
 */

package local.tilde.pepcoding.arrays;

import java.util.Scanner;

public class DigitFrequency {
    public static int frequencyOfDigit(int[] arr, int digit) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == digit) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int s = scan.nextInt();

        System.out.println("Enter elements in array arr: ");
        int[] arr = new int[s];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter digit(frequency to be find): ");
        int digit = scan.nextInt();

        int frequency = frequencyOfDigit(arr, digit);
        System.out.println("Frequency of " + digit + ": " + frequency);
        scan.close();
    }
}

// Compilation: javac -d ./classes/
// ./src/local/tilde/pepcoding/arrays/DigitFrequency.java
// Run: java -cp ./classes/ local.tilde.pepcoding.