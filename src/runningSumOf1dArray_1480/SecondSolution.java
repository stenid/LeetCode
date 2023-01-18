package runningSumOf1dArray_1480;

public class SecondSolution {

    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++)
            nums[i] = nums[i] + nums[i - 1];
        return nums;
    }
}
/*
        That solution is less space consuming, because we do not create a new array.
    But you need to be aware that our nums array was overwrite after this method
    implementation. If that array is used in another part of program, these changes
    may impact.
 */