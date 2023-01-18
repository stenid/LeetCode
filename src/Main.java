import runningSumOf1dArray_1480.SecondSolution;
import runningSumOf1dArray_1480.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        int[] input = {1, 1, 1, 1, 1};
        int[] result = solution.runningSum(input);
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Result: " + Arrays.toString(result));

        var secondSolution = new SecondSolution();
        int[] secondResult = solution.runningSum(input);
        System.out.println("----------------------------------");
        System.out.println("Second solution");
        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Result: " + Arrays.toString(result));

    }
}