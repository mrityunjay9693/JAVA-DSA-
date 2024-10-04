/**
 * Problem 12: Write a java program to read the integer value from the user and print weather it is an even or odd number.

 * Input Format:Enter a number: num (any number)                
 * Output Format: even/odd
 
 * Sample Input 1 : Enter a number: 23              
 * Sample Output : odd
 * Sample Input 2 : Enter a number: 46              
 * Sample Output : even
 */

package local.tilde.raghusir.brachingconstrolstatement;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if (num == 0) {
            System.out.println("The number is 0.");
        } else if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        
        scan.close();
    }
}
