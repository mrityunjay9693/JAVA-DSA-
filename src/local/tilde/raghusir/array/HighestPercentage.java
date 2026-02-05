/**
 * Problem Statement: Write a java program to initialize 5 students percentage and then display the highest percentage
 * Explanation: You have to initialize 5 students percentage and print the which percentage is the highest.
 * Input: [78.05, 65.87, 54.67, 76.43, 98.08]
 * Output: Highest Percentage : 98.08 
 */

package local.tilde.raghusir.array;

import java.util.Scanner;

public class HighestPercentage {
    public void highestPercentage() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        double[] marksOfStudents = new double[5];
        for (int i = 0; i < 5; i++) {
            marksOfStudents[i] = scan.nextDouble();
        }
        double highestValue = marksOfStudents[0]; // highestValue = 98.08
        for (int i = 0; i < 5; i++) {
            if (highestValue < marksOfStudents[4]) {
                highestValue = marksOfStudents[i];
            }
        }
        System.out.println("Highest Percentage :" + highestValue);
        scan.close();
    }

    public static void main(String[] args) {
        HighestPercentage hp = new HighestPercentage();
        hp.highestPercentage();
    }

}
