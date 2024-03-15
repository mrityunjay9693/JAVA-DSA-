/**
 * Problem: Rtate An Array
            1.You are given a number "n", representing the size of array "arr".
            2.You are given "n" numbers, representing the values/elements of array "arr".
            3.You are given a number "k", representing the number of rotation.
            4.Rotate the array arr, k times to the right,for +ve value of k and to left, for -ve value of k.   
 * Constraints: 0 <= n < 10^4 and -10^9 <= a[i], k <= n < 10^9.
 * Sample Input : 5 (n:size of arr)
                  1, 2, 3, 4, 5 
                  3 (k : k number of times, arr has to rotate)
 * Sample Output: 3, 4, 5, 1, 2
 */
package local.tilde.pepcoding.arrays;

import java.util.Scanner;

public class RotateAnArray {
    public static void rotateArray(int[] arr, int k) {
        // Write your code here
        // true rotation
        k = k % arr.length;
        // negative rotation
        if (k < 0) {
            // making true rotation positive.
            k = k + arr.length;
        }
                
        reverseArray(arr, arr.length - k, arr.length - 1);  // reverse p2 of array
        reverseArray(arr, 0, arr.length - k - 1);    // reverse p1 of array
        reverseArray(arr, 0, arr.length - 1);       // reverse whole array
        System.out.println("arr.length - k: "+(arr.length - k));
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            // swapping
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array arr : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter value for rotation(k) : ");
        int k = scan.nextInt();
        
        // taking input in arr
        System.out.println("Enter values in arr : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        rotateArray(arr, k);
        System.out.println("Array arr after rotation : ");
        displayArray(arr);
        scan.close();
    }
}
