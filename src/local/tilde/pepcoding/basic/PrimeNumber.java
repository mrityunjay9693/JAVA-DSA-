package local.tilde.pepcoding.basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Eneter a number:");
        int number = scan.nextInt();
        int flag = 1; // 1 -> prime

        // for (int i = 2; i < (number / 2); i++) {
        // if (number % i == 0) {
        // flag = 0;
        // break;
        // }
        // }

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number == 1) {
                System.out.println(number + " is not a prime number");
                break;
            }
            if (number % i == 0) {
                flag = 0;
                break;
            }
        }

        if (flag == 0) {
            System.out.println(number + " is not a prime number");
        } else {
            System.out.println(number + " is a prime number");
        }
        scan.close();
    }
}
