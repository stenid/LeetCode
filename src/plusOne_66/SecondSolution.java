package plusOne_66;

public class SecondSolution {
    public int[] plusOne(int[] digits) {
        //  [1,2,3]
        //  [4,3,2,1]
        //  [9]
        //  [1,3,9,9,9]
        //  [9,9]

        int n = digits.length;

        for(int i = n - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
