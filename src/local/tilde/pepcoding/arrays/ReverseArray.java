/**
 * Problem: Reverse An Array
            1.You are given a number "n", representing the size of the array arr.
            2.You are given "n" numbers of elements in the array arr.
            3.You are required to reverse the content(items) of the array arr
 * Input Format: n (size of arr)
                 n1, n2, n3, n4, n5, n6, .... n
 * Output Format: n....n6, n5, n4, n3, n2, n1 (reverse od arr)
 * Constraints: 0 <= n < 10^4 and -10^9 <= arr[i] <= 10^9 
 * Sample Input: 5 
                  1, 2, 3, 4, 5
 * Sample Output: 5, 4, 3, 2, 1
 */

package local.tilde.pepcoding.arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        // Write you logic here
        int temp = 0;
        int startPoint = 0;
        int endPoint = arr.length - 1;
        while(startPoint < endPoint){
            //swapping to be done here
            temp = arr[startPoint];
            arr[startPoint] = arr[endPoint];
            arr[endPoint] = temp;
            startPoint++;
            endPoint--;
        }
    }

    public static void displayReverse(int[] arr) {
        // displaying reverse array
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values in arr : ");
        // taking input in array
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        reverseArray(arr);
        System.out.println("Reverse of arr: ");
        displayReverse(arr);

    }
}
