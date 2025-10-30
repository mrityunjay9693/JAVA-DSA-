package local.tilde.icsex.basics;

import java.util.Scanner;

public class ProductOfNumbers {
    public int productOfNumbers(int num1, int num2, int num3) {
        int product = num1 * num2 * num3;
        return product;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter 2nd Number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter 3rd Number: ");
        int num3 = scan.nextInt();

        ProductOfNumbers product = new ProductOfNumbers();
        System.out.println("Product: " + product.productOfNumbers(num1, num2, num3));

        scan.close();
    }
}
