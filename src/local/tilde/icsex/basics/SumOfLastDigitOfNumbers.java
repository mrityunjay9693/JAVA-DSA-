/*
 * Problem Statement : Write a programs to initialize three int variables "a", "b", "c" with 234, 456, and 712 respectively and store the 
                       sum of the last digits of the variables into "d" and displat it
                       
 */

package local.tilde.icsex.basics;

public class SumOfLastDigitOfNumbers {
    public static void main(String[] args) {
        int a = 234;
        int b = 456;
        int c = 712;

        SumOfLastDigitOfNumbers sum = new SumOfLastDigitOfNumbers();
        System.out.println("Sum of the last digits of the numbers : " + sum.sumOfDigit(a, b, c));
    }

    public int sumOfDigit(int num1, int num2, int num3) {
        return num1 % 10 + num2 % 10 + num3 % 10;
    }
}
