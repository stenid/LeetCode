package lengthOfLastWord_58;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var secondSolution = new SecondSolution();
        System.out.println("Case 1, \"Hello world\": " + solution.lengthOfLastWord("Hello world"));
        System.out.println("Case 2 \"   fly me   to   the moon  \": "
                + solution.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println("Case 3 \"luffy is still joyboy\": "
                + solution.lengthOfLastWord("luffy is still joyboy"));

        System.out.println("----------------------------------------");
        System.out.println("Second solution: ");
        System.out.println("Case 1 \"Hello world\": " + secondSolution.lengthOfLastWord("Hello world"));
        System.out.println("Case 2 \"   fly me   to   the moon  \": "
                + secondSolution.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println("Case 3 \"luffy is still joyboy\": "
                + secondSolution.lengthOfLastWord("luffy is still joyboy"));
    }
}
