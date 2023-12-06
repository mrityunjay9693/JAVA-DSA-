//Using if else-if
package local.tilde.pepcoding.basic;

import java.util.Scanner;

public class GradingSystem_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println(" Enter marks of Student: ");
        System.out.print("---------------------------");
        System.out.println();

        System.out.print(" English: ");
        int eng = scn.nextInt();

        System.out.print(" Mathematics: ");
        int math = scn.nextInt();

        System.out.print(" Physics: ");
        int phy = scn.nextInt();

        System.out.print(" Chemistry: ");
        int che = scn.nextInt();

        System.out.print(" Computer Science: ");
        int sc = scn.nextInt();
        System.out.println("---------------------------");

        int totalMarks = eng + math + phy + che + sc;
        System.out.print(" Total Marks : " + totalMarks);
        System.out.println();

        int percentage = (totalMarks / 5);
        System.out.println(" Percentage : " + percentage + " %");
        System.out.println("---------------------------");

        System.out.print(" Remarks : ");

        if (percentage > 90) {
            System.out.println("Excellent.");
        } else if (percentage > 80 && percentage <= 90) {
            System.out.println("Very Good.");
        } else if (percentage > 70 && percentage <= 80) {
            System.out.println("Good.");
        } else if (percentage > 60 && percentage <= 70) {
            System.out.println("Fair.");
        } else if (percentage > 50 && percentage <= 60) {
            System.out.println("Average.");
        } else {
            System.out.println("Below Par.");
        }
        System.out.println("---------------------------");

        scn.close();

    }
}
