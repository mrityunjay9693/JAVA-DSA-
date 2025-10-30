/**
 * Problem Statement : Write a program to average of 36,45, and 53 using variables of adequate data type
 */

package local.tilde.icsex.basics;

public class Average {
    public static void main(String[] args) {
        int a = 36;
        int b = 45;
        int c = 53;

        float average = (float) (a + b + c) / 3;
        System.out.println("Average : " + average);
    }
}
