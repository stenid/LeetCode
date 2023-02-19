package plusOne_66;

public class Solution {
    public int[] plusOne(int[] digits) {
        //  [1,2,3]
        //  [4,3,2,1]
        //  [9]
        //  [1,3,9,9,9]
        //  [9,9]

        int current = digits.length - 1;
        int previous = digits.length - 2;

        if (digits.length == 1 && digits[0] == 9) {
            return new int[]{1, 0};
        }

        if (digits[current] == 9) {
            while (digits[previous] == 9) {
                current--;
                if (current == 0) {
                    int[] result = new int[digits.length + 1];
                    result[0] = 1;
                    for (int k = 1; k < result.length; k++)
                        result[k] = 0;

                    return result;
                }
                previous--;

            }
            int[] result = new int[digits.length];
            for (int i = 0; i < previous; i++)
                result[i] = digits[i];

            result[previous] = (digits[previous] + 1);

            for (int j = current; j < result.length; j++)
                result[j] = 0;

            return result;

        } else
            digits[digits.length - 1]++;

        return digits;
    }
}


/*

66. Plus One

Easy
6.6K
4.7K
Companies

You are given a large integer represented as an integer array digits, where each digits[i]
is the ith digit of the integer. The digits are ordered from most significant to least significant
in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.



Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].


Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
 */