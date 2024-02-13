package local.tilde.pepcoding.function;

import java.util.Scanner;

public class FunctionExp {

    public static int addNum(int n1, int n2){
        int ans = n1 + n2;
        return ans;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Eneter num : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(addNum(num1, num2));
        scan.close();
    }
}
