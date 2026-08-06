
import java.util.Stack;

public class bistack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        int x = stack.pop();
        System.out.println(x);
        int y = stack.peek();
        System.out.println(y);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
