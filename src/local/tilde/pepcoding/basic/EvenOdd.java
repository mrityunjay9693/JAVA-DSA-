package local.tilde.pepcoding.basic;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num = scn.nextInt();
        System.out.println("num:" + num);
        int remainder = num % 2;

        if (remainder == 1) {
            System.out.println(num + " is odd number");
        } else {
            System.out.println(num+" is even number");
        }
        scn.close();
    }
}
