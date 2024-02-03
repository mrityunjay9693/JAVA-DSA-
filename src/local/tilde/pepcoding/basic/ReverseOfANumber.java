package local.tilde.pepcoding.basic;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Eneter a number in num : ");
        int num = scan.nextInt();
        System.out.println();
        
        int digit = 0;
        System.out.println("Number in reverse order: ");

        while(num!=0){
            digit = num%10;
            num = num/10;
            System.out.println(digit);
        }
        scan.close();
    }
}
