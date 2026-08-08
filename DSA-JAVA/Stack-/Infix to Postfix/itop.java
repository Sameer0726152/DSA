
import java.util.Stack;

public class itop {

    private static int precedence(char ch) {
        if (ch == '^') {
            return 3;
        }
        if (ch == '*' || ch == '/') {
            return 2;
        }
        if (ch == '+' || ch == '-') {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        String s = "A*(B+C)";
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && stack.peek() != '(' && precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        System.out.println(result.toString());
    }
}
