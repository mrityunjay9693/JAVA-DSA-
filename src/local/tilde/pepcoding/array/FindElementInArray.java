package src.local.tilde.pepcoding.array;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enetr elements in array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter element to found: ");
        int d = scn.nextInt();

        int found = FindElement(arr, d);
        System.out.println("Element found at index : "+found); 

        scn.close();
    }
    public static int FindElement(int[] arr, int d){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == d){
                return i; // index of element found
            }
        }
        return -1; // not found
    }
}
