package local.tilde.pepcoding.collection;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;

public class HashMapTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile No:");
        String mobile = sc.next();
        HashMap<String, Integer> otps = new HashMap<>();
        int num = 100000 + new Random().nextInt(900000);
        otps.put(mobile, num);
        System.out.println(otps);
        System.out.println("Enter Mobile number");
        String x = sc.next();
        System.out.println("Enter Otp");

        int no = sc.nextInt();
        if (otps.get(x).equals(no)) {
            System.out.println("Verified");
        } else {
            System.out.println("Not Varified");
        }

        sc.close();

    }

}
