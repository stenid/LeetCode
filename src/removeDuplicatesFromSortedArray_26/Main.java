package removeDuplicatesFromSortedArray_26;

public class Main {                             // [1,1,2]; [0,0,1,1,1,2,2,3,3,4]
    public static void main(String[] args) {
        int[] case1 = {1, 1, 2};
        int[] case2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        var solution = new Solution();

        System.out.println("Case1, [1,1,2]: " + solution.removeDuplicates(case1));
        System.out.println("-----------------------------------------");
        System.out.println("Case2, [0,0,1,1,1,2,2,3,3,4]: " + solution.removeDuplicates(case2));
    }
}
