package plusOne_66;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //  [1,2,3]
        //  [4,3,2,1]
        //  [9]
        //  [1,3,9,9,9]

        int[] case1 = {1, 2, 3};
        int[] case2 = {4, 3, 2, 1};
        int[] case3 = {9};
        int[] case4 = {1, 3, 9, 9, 9};
        int[] case5 = {9, 9};

        var solution = new Solution();
        var secondSolution = new SecondSolution();

        System.out.println("Case1, [1,2,3]: " + Arrays.toString(solution.plusOne(case1)));
        System.out.println("Case2, [4,3,2,1]: " + Arrays.toString(solution.plusOne(case2)));
        System.out.println("Case3, [9]: " + Arrays.toString(solution.plusOne(case3)));
        System.out.println("Case4, [1,3,9,9,9]: " + Arrays.toString(solution.plusOne(case4)));
        System.out.println("Case5, [9,9]: " + Arrays.toString(solution.plusOne(case5)));

        System.out.println("--------------------------------");
        System.out.println("Second solution");

        System.out.println("Case1, [1,2,3]: " + Arrays.toString(secondSolution.plusOne(case1)));
        System.out.println("Case2, [4,3,2,1]: " + Arrays.toString(secondSolution.plusOne(case2)));
        System.out.println("Case3, [9]: " + Arrays.toString(secondSolution.plusOne(case3)));
        System.out.println("Case4, [1,3,9,9,9]: " + Arrays.toString(secondSolution.plusOne(case4)));
        System.out.println("Case5, [9,9]: " + Arrays.toString(secondSolution.plusOne(case5)));

    }
}
