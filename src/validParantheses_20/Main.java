package validParantheses_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var secondSolution = new SwitchCaseSolution();
        Scanner scanner = new Scanner(System.in);

        System.out.println("First case is () : " + solution.isValid("()"));
        System.out.println("Second case is ()[]{} : " + solution.isValid("()[]{}"));
        System.out.println("Third case is (] : " + solution.isValid("(]"));

        // My cases :

        System.out.println("Fourth case is )( : " + solution.isValid(")("));
        System.out.print("any value : ");
        System.out.println(solution.isValid(scanner.next()));

        System.out.println("----- Second solution -----");

        System.out.println("First case is () : " + secondSolution.isValid("()"));
        System.out.println("Second case is ()[]{} : " + secondSolution.isValid("()[]{}"));
        System.out.println("Third case is (] : " + secondSolution.isValid("(]"));

        // My cases :

        System.out.println("Fourth case is )( : " + secondSolution.isValid(")("));
        System.out.print("any value : ");
        System.out.println(secondSolution.isValid(scanner.next()));



    }
}
