package climbingStairs_70;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var secondSolution = new SecondSolution();

        System.out.println("First case, 2 steps: " + solution.climbStairs(2));
        System.out.println("Second case, 3 steps: " + solution.climbStairs(3));
        System.out.println("Third case, 5 steps: " + solution.climbStairs(5));

        System.out.println("-------------------------------");
        System.out.println("Second solution: ");

        System.out.println("First case, 2 steps: " + secondSolution.climbStairs(2));
        System.out.println("Second case, 3 steps: " + secondSolution.climbStairs(3));
        System.out.println("Third case, 5 steps: " + secondSolution.climbStairs(5));
    }
}
