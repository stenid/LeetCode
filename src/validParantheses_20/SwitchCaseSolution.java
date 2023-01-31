package validParantheses_20;

import java.util.Stack;

public class SwitchCaseSolution {
    public boolean isValid(String s) {                      // valid input: (); (){}[]; ({[]})
                                                            // invalid input: ((; )); (]; )); ([}}]) ...

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case ')' : if (stack.isEmpty() || stack.pop() != '(') return false; break;
                case ']' : if (stack.isEmpty() || stack.pop() != '[') return false; break;
                case '}' : if (stack.isEmpty() || stack.pop() != '{') return false; break;
                default: stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
