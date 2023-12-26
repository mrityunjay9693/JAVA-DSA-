package local.tilde.exp;

import java.util.Random;

public class seatAllocation {
    void allocateSeat(int studentNumber, int seatNumber) {
        Random random = new Random();
        for (int i = 0; i <= studentNumber; i++) {
            System.out.printf("%3d%10d\n", i, random.nextInt(seatNumber));
        }
    }

    public static void main(String[] args) {
        new seatAllocation().allocateSeat(30, 30);
    }
}
