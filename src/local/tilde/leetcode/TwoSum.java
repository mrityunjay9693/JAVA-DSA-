/* 
 * https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=array

 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up 
   to target. You may assume that each input would have exactly one solution, and you may not use the same element 
   twice. You can return the answer in any order.
 * Example 1: Input: nums = [2,7,11,15], target = 9
              Output: [0,1]
   Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2: Input: nums = [3,2,4], target = 6
              Output: [1,2]
 * Example 3: Input: nums = [3,3], target = 6
              Output: [0,1]
 
 * Constraints: 2 <= nums.length <= 104
                -109 <= nums[i] <= 109
                -109 <= target <= 109
 * Only one valid answer exists.
 */
package local.tilde.leetcode;

import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; i < len; i++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Eneter size of array: ");
        int size = scan.nextInt();

        System.out.println();

        int[] nums = new int[size]; // array
        System.out.println("Eneter values in array: ");
        for (int i = 0; i <= size - 1; i++) {
            nums[i] = scan.nextInt();
        }

        System.out.print("Enter target: " + "\n");
        int target = scan.nextInt();

        int[] result = twoSum(nums, target);
        System.out.print("[");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]);
            System.out.print(",");
        }
        System.out.print("]");
        System.out.println();
        scan.close();

    }
}
