/**
 * Pattern : 
 */

package local.tilde.ashokit.pattern;

public class DiamondPattern {

    public void diamindPattern(int N) {
        // rows : Upper side pyramid
        for (int row = 1; row <= N; row++) {
            // space
            for (int space = N; space > row; space--) {
                System.out.print(" ");
            }
            // star
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int maxStr = 2 * N - 3;
        // rows : down side pyramid
        for (int lr = 1; lr <= (N - 1); lr++) {
            // space
            for (int spc = 1; spc <= lr; spc++) {
                System.out.print(" ");
            }
            // star
            for (int str = 1; str <= maxStr; str++) {
                System.out.print("*");
            }
            System.out.println();
            maxStr = maxStr - 2;
        }
    }

    public static void main(String[] args) {
        DiamondPattern pat = new DiamondPattern();
        pat.diamindPattern(3);
    }
}
