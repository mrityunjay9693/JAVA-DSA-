/*
 * Problem Statement : Write a program to initialise two variables a and b with 5 and 6 respectively and interchange them. 
                       Thus after interchanging, and b will be 6 and 5respectively. 
 */

package local.tilde.icsex.basics;

public class SwappingNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        SwappingNumbers swap = new SwappingNumbers();
        swap.swappingNumbers(a, b);
    }

    public void swappingNumbers(int a, int b) {
        int temp;

        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : ");
        System.out.println("a: " + a + " b: " + b);
    }
}
