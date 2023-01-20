package fizzBuzz_412;

import java.util.ArrayList;
import java.util.List;

public class SecondSolution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            String currentValue = "";

            if (i % 3 == 0)
                currentValue += "Fizz";

            if (i % 5 == 0)
                currentValue += "Buzz";

            if (currentValue.isEmpty())
                currentValue += String.valueOf(i);

            answer.add(currentValue);
        }

        return answer;
    }
}

/*
        In that solution we use concatenation for FizzBuzz case. That approach will be
     useful when we will need to maintain or redo this code.
     For example, we can add Jazz for 7.
 */