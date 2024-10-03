/**
 * Problem 6: Write a java program to read two integern valuesfrom user and perform all arithmetic operation and print result..
              print in following format:
 * Input Format: Enter two numbers: num1 (any number)
 *                                  num2 
 * Output Format: Addition: t1 (addition result)
                  Substraction: t2 (substraction result)
                  Product: t3 (product result)
                  Division: t4 (division result)
 * Sample Input: Enter side: 4
                             7
 * Sample Output: Addition: 6 
                  Substraction: 2
                  Product: 8
                  Division: 2
 */
package local.tilde.raghusir.basic;

import java.util.*;

public class ArithmeticOperation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.print("Addition: "+(num1+num2));
        System.out.println();
        System.out.print("Substraction: "+(num1-num2));
        System.out.println();
        System.out.print("Product: "+(num1*num2));
        System.out.println();
        System.out.print("Division: "+(num1/num2));
        System.out.println();
        scan.close();
    }    
}
