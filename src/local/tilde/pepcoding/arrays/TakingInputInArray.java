package local.tilde.pepcoding.arrays;

import java.util.Scanner;

public class TakingInputInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
    }   
}
