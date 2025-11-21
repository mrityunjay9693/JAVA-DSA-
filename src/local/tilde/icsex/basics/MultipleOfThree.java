/*
 * Problem Statement: Write a program using ternary operator to check whether 27 is a multiple of 3 or not?
 */

package local.tilde.icsex.basics;

public class MultipleOfThree {
    public static void main(String[] args) {
        MultipleOfThree multiple = new MultipleOfThree();
        multiple.isNumberMultipleOfThree(27);
    }

    public void isNumberMultipleOfThree(int num) {
        System.out.println(num % 3 == 0 ? +num + " is multiple of 3" : +num + " is not a multiple of 3");
    }
}
