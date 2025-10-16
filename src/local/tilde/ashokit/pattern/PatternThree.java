/**
 * Right triangle star pattern or a Half-pyramid pattern
 * Pattern: *   
            *   *
            *   *   *
            *   *   *   *
            *   *   *   *   * 
 */

package local.tilde.ashokit.pattern;

public class PatternThree {
    public static void main(String[] args) {
        PatternThree pattern = new PatternThree();
        pattern.patternThree(5);
    }

    public void patternThree(int N) {
        // rows
        for (int rows = 1; rows <= N; rows++) {
            // stars
            for (int stars = 1; stars <= rows; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
