/**
 * Reverse Pyramid or Inverted Right-Angled Triangle
 * Pattern: *   *   *   *   * 
            *   *   *   *   
            *   *   *   
            *   *   
            *   
 */

package local.tilde.ashokit.pattern;

public class ReversePyramid {
    public static void main(String[] args) {
        ReversePyramid pattern = new ReversePyramid();
        pattern.reversePyramid(5);
    }

    public void reversePyramid(int N) {
        for (int row = 0; row < N; row++) {
            for (int star = 0; star < (N - row); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
