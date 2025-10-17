package local.tilde.ashokit.pattern;

public class PatternFour {
    public static void main(String[] args) {
        PatternFour patternfour = new PatternFour();
        patternfour.patternFour(5);
    }

    public void patternFour(int N) {
        for (int row = 1; row <= N; row++) {
            // Space
            for (int space = 1; space <= (N - row); space++) {
                System.out.print(" ");
            }
            // Numbers
            for (int num = 1; num <= row; num++) { // num = 2, row = 2, num<=row : t,t=> 1,2
                System.out.print(num);
            }
            System.out.println();
        }

    }
}
