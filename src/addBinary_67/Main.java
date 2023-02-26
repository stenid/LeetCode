package addBinary_67;

public class Main {
    public static void main(String[] args) {
         /*
        Input: a = "11", b = "1"
        Output: "100"

        Input: a = "1010", b = "1011"
        Output: "10101"

         */
        Solution solution = new Solution();

        System.out.println("Case 1, \"11\" and \"1\": " + solution.addBinary("11", "1"));
        System.out.println("Case 1, \"1010\" and \"1011\": " + solution.addBinary("1010", "1011"));
    }
}
