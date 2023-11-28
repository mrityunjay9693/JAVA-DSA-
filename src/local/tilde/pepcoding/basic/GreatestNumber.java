package local.tilde.pepcoding.basic;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Eneter two numbers: ");

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        if (num1 == num2) {
            System.out.println("Both numbers are equals.");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater number");
        } else {
            System.out.println(num2 + " is greater number");
        }
        scn.close();
    }
}
