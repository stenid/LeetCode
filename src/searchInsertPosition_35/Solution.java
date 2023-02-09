package searchInsertPosition_35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        // [1, 3, 5, 6] target 5
        // [1, 3, 5, 6] target 2
        // [1, 3, 5, 6] target 7

        int left = 0;
        int right = nums.length;
        int index;

        if (nums[nums.length - 1] < target)
            return nums.length;

        if (nums[0] > target)
            return 0;

        while (left <= right) {
            index = left + (right - left) / 2;
            if (nums[index] == target)
                return index;

            else if (nums[index] < target)
                left = index + 1;

            else
                right = index - 1;
        }
        return left;
    }
}


/*
35. Search Insert Position

Easy
11.5K
527
Companies

Given a sorted array of distinct integers and a target value, return the index if the
target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
 */