package local.tilde.pepcoding.function;

import java.util.*;

public class FunctionIntroduction {
    // function/method definition and body
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        //System.out.print(sum);
        return sum;
    }
    public static void differenceNumbers(int num1, int num2){
        int ans = num1 - num2;
        System.out.println("Difference of " + num1 + " and " + num2 + " : " + ans);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two values in numbers: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int result = addNumbers(number1, number2);
        System.out.println("Addition of " + number1 + " and " + number2 + " : " + result);
        differenceNumbers(100, 67);
        scan.close();

    }
}
