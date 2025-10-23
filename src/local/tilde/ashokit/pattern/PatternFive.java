/**
 * Pattern :                1
                        2   1
                    3   2   1
                4   3   2   1
            5   4   3   2   1 
 */

package local.tilde.ashokit.pattern;

public class PatternFive {
    public static void main(String[] args) {
        PatternFive pattern = new PatternFive();
        pattern.patternFive(5);
    }

    public void patternFive(int N) {
        // rows
        for (int row = 1; row <= N; row++) {
            // spaces
            for (int space = 1; space <= (N - row); space++) {
                System.out.print(" ");
            }
            // numbers
            for (int num = row; num > 0; num--) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
