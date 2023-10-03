package src.local.tilde.pepcoding.basic;

import java.util.Scanner;

public class GreatestAmongThree {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        System.out.print("Greatest Number among three is : ");

        if(a > b && a> c){
            System.out.println(a);
        }

        scn.close();
    }   
}
