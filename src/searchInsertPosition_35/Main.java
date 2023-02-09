package searchInsertPosition_35;

public class Main {
    public static void main(String[] args) {
        // [1, 3, 5, 6] target 5
        // [1, 3, 5, 6] target 2
        // [1, 3, 5, 6] target 7
        int[] array = {1, 3, 5, 6};

        var solution = new Solution();

        System.out.println("First case, [1, 3, 5, 6], target 5: " + solution.searchInsert(array, 5));
        System.out.println("Second case, [1, 3, 5, 6], target 2: " + solution.searchInsert(array, 2));
        System.out.println("Third case, [1, 3, 5, 6], target 7: " + solution.searchInsert(array, 7));
        System.out.println("Fourth case, [1, 3, 5, 6], target 4: " + solution.searchInsert(array,4));
    }
}
