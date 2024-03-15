/**
 * Problem: Sum Of Two Arrays.
            1.You are given a numbetr n and m, representing the size of array arr1 and arr2 respectively.
            2.You are given n numbers and m numbers, representing the elements of array arr1 and arr2 respectively.
            3.The two array(arr1 and arr2) representds the digit of two numbers.
            You are required to add numbers representerd by two arrays and print the sum in an array.
 * Constarints: 1 <=n, m <= 100 and 0 <= arr1[i] , arr2[i] <= 10
 * Input Format: n (size of arr1)
                 m (size of arr2)
                 n1, n2, n3, n4, n5, ... n(elements of arr1)
                 m1, m2, m3, m4, m5, ... m(elements of arr2)
 * Output Format: k1, k2, k3, k4, k5, ..... k (representing the sum of elements of array arr1 and array arr2)
                  The number representing sum of two numbers represented by two arrays.
 * Sample Input: 5 (n : size of arr1)
                 6 (m : size of arr2)
                 3, 1, 0. 7, 5 ( elements/values of arr1 representing a numbers in the array)
                 1, 1, 1, 1, 1, 1 ( elements/values of arr2 representing a numbers in the array)
 * Sample Output: 1, 4, 2, 1, 8, 6 (A number representing sum of two numnbers, represented by tywo arrays)
 */
package local.tilde.pepcoding.arrays;

import java.util.Scanner;

public class SumTwoArrays {
    public static int[] sum(int[] arr1, int[] arr2) {
        // Write your logic here
        int n = arr1.length; // size of arr1
        int m = arr2.length; // size of arr2
        int k = Math.max(n, m); // size of resultant array
        int[] result = new int[k];
        int p1 = n - 1;
        int p2 = m - 1;
        int p3 = k - 1;
        int carry = 0;

        while (p1 >= 0 || p2 >= 0) {
            int num1 = p1 >= 0 ? arr1[p1] : 0;
            int num2 = p2 >= 0 ? arr2[p2] : 0;
            int sum = num1 + num2 + carry;

            int digit = sum % 10;
            carry = sum / 10;
            result[p3] = digit;

            p1--;
            p2--;
            p3--;
        }

        if (carry != 0) {
            int[] newResult = new int[k+1];
            newResult[0] = carry;
            for(int i = 1; i < newResult.length; i++) {
                newResult[i] = result[i-1];
            }
            return newResult;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array arr1 : ");
        int n = scan.nextInt();
        System.out.print("Enter size of array arr2 : ");
        int m = scan.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter values in arr1 : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }
        int[] arr2 = new int[m];
        System.out.println("Enter values in arr2 : ");
        for (int i = 0; i < m; i++) {
            arr2[i] = scan.nextInt();
        }
        int[] result = sum(arr1, arr2);
        System.out.println("Sum of arr1 and arr2: ");
        for (int value : result) {
            System.out.println(value);
        }
        scan.close();
    }

}
