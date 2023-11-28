package local.tilde.pepcoding.basic;

import java.util.Scanner;

public class GradingSystem {
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
        }
        if (percentage > 80 && percentage <= 90) {
            System.out.println("Very Good.");
        }
        if (percentage > 70 && percentage <= 80) {
            System.out.println("Good.");
        }
        if (percentage > 60 && percentage <= 70) {
            System.out.println("Fair.");
        }
        if (percentage > 50 && percentage <= 60) {
            System.out.println("Average.");
        }
        if (percentage <= 50) {
            System.out.println("Below Par.");
        }
        System.out.println("---------------------------");

        scn.close();
    }
}
