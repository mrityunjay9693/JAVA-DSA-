/**
 * Problem: Span Of Array
            1.You are given a number "n", representing the count of elements.
            2.You are given n numbers.
            3.You are required to find the span of inputs. Span is defined as difference of maximum value and
              minimum value.
            4.Return span value
 * Input Format: n (total numbers of element in an array)
                 n1, n2, n3, n4, n5, n6, ... nn.
 * Output Format: spanValue ( maximum value - minimum value)
 * Constraints: 1 <= n <= 10^4 and 0 <= n1, n2, n3, n4, n5, n6, ... n elements <= 10^9
 * Sample Inputs: 6 (n)
                  15, 30, 40, 4, 11, 9
 * Sample OUtput: 36 (40 - 4)
 * Span value = Maximum value - Minimum value
 */

package local.tilde.pepcoding.arrays;

import java.util.Scanner;

public class SpanOfArray {
  public static int findSpan(int[] arr, int n) {
    //Write your logic here.
    int maxValue = arr[0];
    int minValue = arr[0];

    for (int i = 0; i < n; i++) {
      if (arr[i] > maxValue) {
        maxValue = arr[i];
      }
      if (arr[i] < minValue) {
        minValue = arr[i];
      }
    }
    return (maxValue - minValue);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter size of array(n): ");
    int n = scan.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter values in array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }

    System.out.print("Span of array: ");
    System.out.print(findSpan(arr, n) + "\n");
    scan.close();
  }
}
