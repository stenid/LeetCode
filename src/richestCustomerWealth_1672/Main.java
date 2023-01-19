package richestCustomerWealth_1672;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var solution = new SecondSolution();
        int[][] accountsCase1 = {{1, 2, 3}, {3, 2, 1}};
        int[][] accountsCase2 = {{1, 5}, {7, 3}, {3, 5}};
        int[][] accountsCase3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

        System.out.println("Case1: " + Arrays.deepToString(accountsCase1));
        System.out.println("Solution: " + solution.maximumWealth(accountsCase1));
        System.out.println("------------------------------------");

        System.out.println("Case2: " + Arrays.deepToString(accountsCase2));
        System.out.println("Solution: " + solution.maximumWealth(accountsCase2));
        System.out.println("------------------------------------");

        System.out.println("Case2: " + Arrays.deepToString(accountsCase3));
        System.out.println("Solution: " + solution.maximumWealth(accountsCase3));
        System.out.println("------------------------------------");

    }
}
