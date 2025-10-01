package local.tilde.pw.arrays;

import java.util.Scanner;

public class ArrayReference {
    public static int[] inputArray(int size) {
        int[] arr = new int[size];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter items in arr: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        arr = inputArray(size);
        System.out.println("arr : ");
        printArray(arr);
        // copying arr to arr2
        int[] arr2 = arr;
        System.out.println("arr2 : ");
        printArray(arr2); // copied array
        // changine values inside arr2
        arr2[0] = 11;
        arr2[1] = 12;
        System.out.println("Original array after changing arr2: ");
        printArray(arr);
        System.out.println("Copied array arr2 after changing it: ");
        printArray(arr2);
        scan.close(); 
    }
}
