package reduceNumberToZero_1342;

public class SecondSolution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if ((num & 1) == 0)     // num: xxxxxxx0 & bitmask: 00000001
                num >>= 1;          // same as num = num >> 1;
            else
                num--;

            steps++;
        }
        return steps;
    }
}
/**
 * That solution solves problem through bitwise operations.
 *
 *      In binary representation of integer if last digit is 0 (00101110) means that integer is even.
 *      Otherwise, if last digit is 1 (00010111) - that integer is odd.
 *
 *      >> moves all digits to the right in the binary representation of integer
 *      and add 0 at the beginning.
 *      When you move all digits to the right on 1 position it's equally to
 *      dividing by 2.
 *
 *      When you subtract 1 from integer, in binary representation last 1 digit become 0.
 */