
import java.util.Stack;

public class ngstack {

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3};
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        for (int value : ans) {
            System.out.print(value + " ");
        }
    }
}
