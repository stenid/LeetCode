package twoSum1;

import java.util.HashMap;
import java.util.Map;

public class BetterSolution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if(complementIndex != null) {
                return new int[] {i, complementIndex};
            }
            complements.put(target - nums[i], i);

        }
        return nums;
    }


    /*
    {5, 2, 4}
    6

    HashMap
    K -> V
    on index 0 we got 5, and we know that we need to add a 1 to get the target(6)
    => We are assigning to key 1 and to value 0 (index in array).
    1 -> 0
    4 -> 1
    {2, 1}

     */
}
