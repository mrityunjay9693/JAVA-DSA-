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
 * Sample OUtput:2 (40 is found at index 2)
 */

package local.tilde.pepcoding.arrays;

import java.util.Scanner;

public class FindElementsInAnArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Eneter size(n) of array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        int elementFounds = 0;
        System.out.println("Enter elements in arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("d : ");
        int d = scan.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == d) {
                System.out.print("Element is found at index : " + i + "\n");
                elementFounds = 1;
            }
        }
        if(elementFounds == 0) {
            System.out.println("-1");
            System.out.println("Element not found!");
        }
        scan.close();
    }
}
