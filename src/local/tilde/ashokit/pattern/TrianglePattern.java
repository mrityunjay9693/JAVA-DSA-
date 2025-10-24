package local.tilde.ashokit.pattern;

public class TrianglePattern {
    public static void main(String[] args) {
        TrianglePattern pat = new TrianglePattern();
        pat.trianglePattern(5);
    }

    public void trianglePattern(int N) {
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
