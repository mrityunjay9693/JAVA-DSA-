/**
 * Problem Statement : Write a program using int variables to find the sum of three numbers say 15, 36 and 45 and 
                       subtract the result from 100 using variables 
 */

package local.tilde.icsex.basics;

public class SubtractSumFromHundred {
    public static void main(String[] args) {
        int a = 15;
        int b = 36;
        int c = 45;
        int d = 100;

        int result = d - (a + b + c);
        System.out.println(result);
    }
}
