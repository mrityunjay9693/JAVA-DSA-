/**
 * Problem Statement : Write a program to find the product of the sum and the difference between 17 and 2 using variables. 
 */

package local.tilde.icsex.basics;

public class ProductOfSumAndDifference {
    public static void main(String[] args) {
        int firstNum = 17;
        int secondNUm = 2;

        int product = (firstNum + secondNUm) * (firstNum - secondNUm);
        System.out.println(
                "Product of the sum and the difference between " + firstNum + " and " + secondNUm + " : " + product);
    }
}
