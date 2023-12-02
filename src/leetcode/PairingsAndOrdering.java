package leetcode;

import java.util.Stack;

/**
 * Examine the accuracy of pairings and ordering of, {}, (), and [] in an expression.
 *
 * Input = “([()]{}{[()()]()})”
 * Output = true
 *
 * Input = “[()}"
 * Output = false
 */

public class PairingsAndOrdering {
    public static void main(String[] args) {
        String s = "{([()]{}{[()()]()})}";
        System.out.println(validator(s));
    }

    private static boolean validator(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if ('{' == ch || '(' == ch || '[' == ch) {
                stack.push(ch);
            } else if ('}' == ch && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (']' == ch && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (')' == ch && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}


