/**
1.You are given a number following certain constraints.
  The key constraints is : if the number is 5-digit is long, it'll contain all the digit from 1 to 5 without 
  missing any and without repeating any e.g: 23415 is a 5-digit long number containing all digits from 1 to 5, 
  without missing and repeating any digits from 1 to 5. Take a look at few other valid numbers- 624135, 
  81456273 etc. Here are a few invalid numbers - 139, 7421357 etc. The inverse of a number is defined as the 
  number created by interchanging the face value and index of digits of numbers. For example: 426135(reading 
  from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3, 6 is in place 4, 2 is in place 5 and 4 
  is in place 6), the inverse will be 416253(reading from right to left, 3 is in place 1, 5 is in place 2, 2 is 
  in place 3, 6 is in place 4, 1 is in place 5 and 4 is in place 6) More example- inverse of 2134 is 1243 and 
  inverse of 24153 is 24153.
2.Take "num" as number input, assume that the number will follow constraints.
3.Prints it's inverse.
Constrairs
1 <= n < 10^8, and following other constraints defined above.
4.Format
  Input : num, Where n is any integer which following constrints defined above.
  Output : "i", the inverted number.
5.Sample Input
  n : 28346751
  Sample Output
  i : 73425681(inverse of n)
 */
package local.tilde.pepcoding.basic;

import java.util.Scanner;

public class InverseNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Eneter input number for inverse: ");
    int num = scan.nextInt();
    int temp = num;
    int pos = 1;
    int inverse = 0;

    while (temp != 0) {
      int digit = temp % 10;
      int i = (int) (pos * Math.pow(10, digit - 1));
      inverse = inverse + i;
      pos++;
      temp = temp / 10;
    }
    System.out.print("Inverse of " + num + " : " + inverse);
    scan.close();
  }
}
