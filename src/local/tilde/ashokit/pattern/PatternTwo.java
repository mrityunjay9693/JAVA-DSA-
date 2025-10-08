/**
 * Pattern :                *
                        *   *
                    *   *   *
                *   *   *   *
            *   *   *   *   *         
 */

package local.tilde.ashokit.pattern;

import java.util.Scanner;

public class PatternTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value of rows: ");
        int rows = scan.nextInt();

        PatternTwo pattern = new PatternTwo();
        pattern.patternTwo(rows);

        scan.close();
    }

    public void patternTwo(int N) {
        // Rows
        for (int i = 0; i < N; i++) {
            // Spaces
            for (int j = 1; j < (N - i); j++) { // N = 4, j = 0, 1,
                System.out.print(" ");

            }

            // Stars
            for (int str = 0; str <= i; str++) {
                System.out.print("*");
            }
            System.out.println(); // Next Line
        }
    }
}
