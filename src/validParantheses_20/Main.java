package validParantheses_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("First case is () : " + solution.isValid("()"));
        System.out.println("Second case is ()[]{} : " + solution.isValid("()[]{}"));
        System.out.println("Third case is (] : " + solution.isValid("(]"));

        // My cases :

        System.out.println("Fourth case is )( : " + solution.isValid(")("));
        System.out.print("any value : ");
        input = scanner.next();
        System.out.println(solution.isValid(input));



    }
}
