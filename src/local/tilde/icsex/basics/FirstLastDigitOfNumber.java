/*
 * Problem statement : Write a program to initialise an int variable "num" with a value 76498 and from it extract the first digit and store 
                       it into a variable "firstDigit" and extract the last digit of the number and store it also into another variable 
                       "lastDigit" and then display firstDigit and lastDigit.
 */

package local.tilde.icsex.basics;

public class FirstLastDigitOfNumber {
    public static void main(String[] args) {
        int num = 76498;

        FirstLastDigitOfNumber digit = new FirstLastDigitOfNumber();
        digit.firstLastDigit(num);
    }

    public void firstLastDigit(int num) {
        int firstDigit = num % 10;
        int lastDigit = num / 10000;
        System.out.println("FIrst Digit of " + num + ": " + firstDigit);
        System.out.println("Last Digit " + num + ": " + lastDigit);
    }
}
