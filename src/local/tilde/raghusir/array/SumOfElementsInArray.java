package local.tilde.raghusir.array;

import java.util.Scanner;

public class SumOfElementsInArray {
    public int sumOfElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfElementsInArray sum = new SumOfElementsInArray();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter values in arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int sumOfArr = sum.sumOfElements(arr);
        System.out.println("Sum of elements in arr : " + sumOfArr);

        scan.close();
    }
}
