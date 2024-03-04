/**
 * Problem: Inverse Of An Array
            1.You are given a number "n",representing the size of array arr.
            2.You are given n numbers, representing elements of array arr.
            3.You are required to calculate the inverse of array array arr. 
 * Constraints :0 <= n < 10^7. The only difference is the range of values is from 0 to n-1, instead of 1 to n.
 * Sample Input: 5 (n : size of array arr)
                 4, 0, 2, 3, 1
 * Sample Output:1, 4, 2, 3, 0
 */

package local.tilde.pepcoding.arrays;

import java.util.Scanner;

public class InverseOfArray {
    public static int[] inverseArray(int[] arr) {
        // Logic
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i]; // making value of arr as index for inverseArr
            ans[j] = i;
        }
        return ans;
    }

    public static void display(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array(n): ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values inside arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Inverse of arr: ");
        int[] inverse = inverseArray(arr);
        display(inverse);
        System.out.println();
        scan.close();
    }
}
