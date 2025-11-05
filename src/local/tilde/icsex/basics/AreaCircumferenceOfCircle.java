/*
 * Problem Statement : Write a program using variables to find the area and circumferenceof a circle 
                       whose radius is 12cm.
 * pi = 3.142
 * area = pi * r * r(read as : pi r square)
 * circumference : 2 * pi * r (read as : two pi r)
 */

package local.tilde.icsex.basics;

public class AreaCircumferenceOfCircle {
    public static void main(String[] args) {
        float radius = 12;

        float area = 3.142f * radius * radius;
        float circumference = 2 * 3.142f * radius;

        System.out.println("Area : " + area);
        System.out.println("Circumference : " + circumference);
    }
}
