package local.tilde.raghusir.basic;

public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber armstrong = new ArmstrongNumber();
        armstrong.armstrongNumber(153);
    }

    public void armstrongNumber(int num) {
        int numToBeChecked = num;
        int result = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            result = (lastDigit * lastDigit * lastDigit) + result;
            num /= 10;
        }

        if (numToBeChecked == result) {
            System.out.println(numToBeChecked + " is a armstrong number");
        } else {
            System.out.println(numToBeChecked + " is not a armstring number");
        }

    }

}
