package ransomNote_383;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var secondSolution = new SecondSolution();
        System.out.println(solution.canConstruct("a", "b"));

        System.out.println(solution.canConstruct("aa", "ab"));

        System.out.println(solution.canConstruct("aa", "aab"));

        System.out.println("Second solution: ");
        System.out.println(secondSolution.canConstruct("a", "b"));
        System.out.println(secondSolution.canConstruct("aa", "ab"));
        System.out.println(secondSolution.canConstruct("aa", "aab"));

    }
}
