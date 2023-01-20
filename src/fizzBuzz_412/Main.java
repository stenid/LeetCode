package fizzBuzz_412;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var secondSolution = new SecondSolution();

        var answer = solution.fizzBuzz(15);
        var secondAnswer = secondSolution.fizzBuzz(15);
        System.out.println("First solution: " + answer);
        System.out.println("Second solution: " + secondAnswer);
    }
}
