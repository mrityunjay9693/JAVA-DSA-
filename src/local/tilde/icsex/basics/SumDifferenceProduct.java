/**
 * Problem Statement : Write a program to find the sum, difference, and product of 12.35 and 7.3 using variables with a single 
                       System.out.print() statement, however with a horizontal tab space in the result.
 */

package local.tilde.icsex.basics;

public class SumDifferenceProduct {
    public static void main(String[] args) {
        double num1 = 12.35;
        double num2 = 7.3;

        System.out.println(
                "Sum: " + (num1 + num2) + "\t" + "Difference: " + (num1 - num2) + "\t" + "Product: " + (num1 * num2));

    }
}
