
//The most efficient way
package local.tilde.pepcoding.basic;

import java.util.Scanner;

public class GreatestNumberAmongThree_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int fst_num = scan.nextInt();

        System.out.println("Enter Second number: ");
        int second_num = scan.nextInt();

        System.out.println("Enter third number: ");
        int third_num = scan.nextInt();

        if (fst_num > second_num) {
            if (fst_num > third_num) {
                System.out.println("Greatest number is:" + fst_num);
            } else
                System.out.println("Greatest number: " + third_num);
        } else {
            if (second_num > third_num) {
                System.out.println("Greatest number:" + second_num);
            } else
                System.out.println("Greatest number:" + third_num);
        }
        scan.close();
    }
}
