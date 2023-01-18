package runningSumOf1dArray_1480;

import java.util.ArrayList;

public class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }
}
/*
Given an array nums. We define a running sum of an array as

runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.


Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 */

/**
 * code from Main class:
 *
 * import runningSumOf1dArray_1480.SecondSolution;
 * import runningSumOf1dArray_1480.Solution;
 *
 * import java.util.Arrays;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         var solution = new Solution();
 *         int[] input = {1, 1, 1, 1, 1};
 *         int[] result = solution.runningSum(input);
 *         System.out.println("Input: " + Arrays.toString(input));
 *         System.out.println("Result: " + Arrays.toString(result));
 *
 *         var secondSolution = new SecondSolution();
 *         int[] secondResult = solution.runningSum(input);
 *         System.out.println("----------------------------------");
 *         System.out.println("Second solution");
 *         System.out.println("Input: " + Arrays.toString(input));
 *         System.out.println("Result: " + Arrays.toString(result));
 *
 *     }
 * }
 */
