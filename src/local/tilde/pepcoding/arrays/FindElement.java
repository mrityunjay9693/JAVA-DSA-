/**
 * Problem: Find Elements In An Array.
            1.You are given a number "n", representing the size of array "arr".
            2.You are given "n" distinct numbers, representing elements of "arr" i.e., n1, n2, n3, .. nn.
            3.You are given another number "d".
            4.You are required to chek if "d" number exists in the array "arr" or not. If "d" found, return its value
              index, otherwise return -1.
 * Input Format: n (size of the array)
                 n1, n2, n3, n4, n5, n6...nn
                 d (any number or element of array "arr") 
 * Output Format: i (the index at which d found)
                 -1 (-1 is returned when, d is not found in the array)
 * Constraints : 1 <= n <= 10^7
                -10^9 < n1, n2, n3, n4....nn <= 10^9
                -10^9 <= d <= 10^9
 * Sample Input: 6 (size of the array)
                 15, 30, 40, 4, 11, 9
                 40 (d: number to be found)
 * Sample OUtput: 2 (40 is found at index 2)
 */

package local.tilde.pepcoding.arrays;

import java.util.Scanner;

public class FindElement {
    public static int findElement(int[] arr, int d) {
        // write logic to find element in an array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                return i; // element found
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size(n) of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Eelement to be found(d): ");
        int d = scan.nextInt();
        System.out.println("*If element found, index returned, otherwise -1 returned");
        System.out.println(findElement(arr, d));
        scan.close();
    }
}
