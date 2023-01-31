package validParantheses_20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {                      // valid input: (); (){}[]; ({[]})
                                                            // invalid input: ((; )); (] ...
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for ( char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}


    /*
    20. Valid Parentheses
Easy
17.8K
989
Companies
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true

Example 2:

Input: s = "()[]{}"
Output: true

Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
     */
