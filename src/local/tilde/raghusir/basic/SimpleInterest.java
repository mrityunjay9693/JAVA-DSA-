/**
 * Problem 14: Write a java program to read three input from the user.
               One input is "amount", second input is "interest rate", third input is "time period".
               All input has double datatypes.
               You to calculate the simple interest of the amount given by the user.
               We have to take three integers
               Time period means how many years later you will pay.

 * Input Format: Enter amount : amt
                 Enter interest rate : ir
                 Enter time period : time
 * Output Format: simple interest (value which is calculated)
 
 * Sample Input: Enter amount : 5000.0
                 Enter interest rate : 15.0
                 Enter time period : 1.0
 * Sample Output: Simple Interest : 750.0
                     
 * Simple Interest(S.I) : amount * (1 + ( interest rate * time ) / 100 )
 
 */
package local.tilde.raghusir.basic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = scan.nextDouble();

        System.out.print("Enter interest rate: ");
        double interestRate = scan.nextDouble();

        System.out.print("Enter time period: ");
        double timePeriod = scan.nextDouble();

        double simpleInterest = (amount * interestRate * timePeriod) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        scan.close();
    }
}
