package local.tilde.pepcoding.basic;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 20;
        
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("Arithmetic Operation of "+num1+" and "+num2+":");

        int addition = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int modulous_division = num1 % num2;
        int integral_division = num1 / num2;

        System.out.println("addition: "+addition);
        System.out.println("difference: "+difference);
        System.out.println("product: "+product);
        System.out.println("modulous_division: "+modulous_division);
        System.out.println("integral_division: "+integral_division);
    }

}
