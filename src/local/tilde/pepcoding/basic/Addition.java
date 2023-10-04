package local.tilde.pepcoding.basic;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers: "+sum);

        scn.close();
    }
}
