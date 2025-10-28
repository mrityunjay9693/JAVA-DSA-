/**
 * Pattern:     *    
              * * *
            * * * * *   
 */

package local.tilde.ashokit.pattern;

public class PyramidPattern {
    public static void main(String[] args) {
        PyramidPattern pat = new PyramidPattern();
        pat.PyramidPattern1(5);
    }

    public void PyramidPattern2(int N) {
        // Approach : 2
        // rows
        for (int row = 1; row <= N; row++) {
            // Space
            for (int spc = N; spc > row; spc--) {
                System.out.print(" ");
            }
            // stars
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void PyramidPattern1(int N) {

        // Approach : 1
        // rows
        for (int row = 1; row <= N; row++) {
            // space
            for (int space = 1; space <= (N - row); space++) {
                System.out.print(" ");
            }

            // star(left)
            for (int str = row; str > 0; str--) {
                System.out.print("*");
            }
            // star(right)
            for (int str = row; str > 1; str--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
