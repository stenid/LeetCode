package longestCommonPrefix_14;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var secondSolution = new SecondSolution();
        String[] case1 = {"flower", "flow", "flight"};

        System.out.println("First case, [\"flower\",\"flow\",\"flight\"]: "
                + solution.longestCommonPrefix(case1));

        System.out.println("Second case, [\"dog\",\"racecar\",\"car\"]: "
                + solution.longestCommonPrefix(new String[] {"dog", "racecar", "car"}));


        System.out.println("=========== Second solution: ==========");


        System.out.println("First case, [\"flower\",\"flow\",\"flight\"]: "
                + secondSolution.longestCommonPrefix(case1));

        System.out.println("Second case, [\"dog\",\"racecar\",\"car\"]: "
                + secondSolution.longestCommonPrefix(new String[] {"dog", "racecar", "car"}));
    }
}
