package local.tilde.exp;

public class LocalVariable {
    public static void main(String[] args) {
        /*
         * int num;
         * System.out.println(num); --> The local variable num may not have been
         * initialized.
         */
        int num = 12;
        System.out.print("Local variable num = " + num);
    }
}
