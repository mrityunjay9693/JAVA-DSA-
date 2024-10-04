/**
 * Problem 10: Write a java program to read the height(in meter) and weight(in Kilogram) of a person from the user and 
               to print the body mass index (BMI) of the person.

 * Input Format:Enter height(m): height (any number(in double))
                Enter weight(Kg):weight (any number(in double))
                
 * Output Format: bmi (any number(in double))
 
 * Sample Input 1 : Enter height(m): 1.75
                    Enter weight(Kg): 64               
 * Sample Output:   BMI of the person: 22.9
 
 * BMI(Body Mass Index): weight / (height * height)
 */
package local.tilde.raghusir.brachingconstrolstatement;

import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter height(m): ");
        double height = scan.nextDouble();

        System.out.println("Enter weight(Kg): ");
        double weight = scan.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // BMI rounded to one decimal place
        System.out.printf("BMI of the person: %.1f\n", (bmi));
        
        scan.close();
    }
}
