package local.tilde.pepcoding.basic;

import java.util.Scanner;

public class CountDigitInANumber {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);

        System.out.print("Enetr a number: ");
        int n = scan.nextInt();
        int temp = n;

        int d = 0;

        while(temp != 0){
            temp = temp/10;
            d++; // count of digit. 
        }
        System.out.println("Total count of digit in "+n +" : " +d);
    }
}
