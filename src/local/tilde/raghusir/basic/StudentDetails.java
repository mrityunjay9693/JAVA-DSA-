/**
 * Problem 1: Write a java program to read name, mobile number, 10th percentage, 12th percentage, and degree percentage 
              and print in followingformat:
 * Input Format: Enter Student's name: Mrityunjay Kumar.
                 Enter Mobile Number: 80029452
                 Enter 10th Percentage: 77.69
                 Enter 12th percentage: 68.82
                 Enter Graduation Degree Percentage: 73.82 
 * Output Format:Student's name: Mrityunjay Kumar.
                 Mobile Number: 80029452
                 10th Percentage: 77.69
                 12th percentage: 68.82
                 Graduation Degree Percentage: 73.82
 *  
 */
package local.tilde.raghusir.basic;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println("               Student Details               ");
        System.out.println("-----------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student's name: ");
        String studentName = scan.nextLine();
        System.out.println("Enter Mobile Number: ");
        double mobileNumber = scan.nextDouble();
        System.out.println("Enter 10th Percentage: ");
        float tenthPercent = scan.nextFloat();
        System.out.println("Enter 12th percentage: ");
        float twelvePercent = scan.nextFloat();
        System.out.println("Enter Graduation Degree Percentage: ");
        float graduationDegree = scan.nextFloat();
        System.out.println("-----------------------------------------");
        System.out.println("               Student Details               ");
        System.out.println("-----------------------------------------");
        System.out.println("Student's name: "+studentName);
        System.out.println("Mobile Number:"+mobileNumber);
        System.out.println("10th Percentage: "+tenthPercent);
        System.out.println("12th percentage: "+twelvePercent);
        System.out.println("Graduation Degree Percentage: "+graduationDegree);
        System.out.println("-----------------------------------------");
        scan.close();


    }
}
