package sqrt_69;

public class SecondSolution {                   // [0,1,|2|,|3,4|,5,6,7,8]
    public int mySqrt(int x) {
        if (x < 2) return x;

        long num;
        int mid;
        int left = 2;
        int right = x/2;

        while (left <= right) {
            mid = (left + right) / 2;
            num = (long) mid * mid;
            if (num > x) right = mid - 1;
            else if (num < x) left = mid + 1;
            else return mid;
        }
        return right;
    }
}
