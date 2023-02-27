package sqrt_69;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var secondSolution = new SecondSolution();
        var case1 = 4;
        var case2 = 8;

        System.out.println("First case, " + case1 + ": " + solution.mySqrt(case1));
        System.out.println("Second case, " + case2 + ": " + solution.mySqrt(case2));

        System.out.println("==========================");
        System.out.println("Second solution: ");

        System.out.println("First case, " + case1 + ": " + secondSolution.mySqrt(case1));
        System.out.println("Second case, " + case2 + ": " + secondSolution.mySqrt(case2));
    }
}
