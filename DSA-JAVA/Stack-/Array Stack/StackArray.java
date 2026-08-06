
public class StackArray {

    static class Stack {

        int[] arr;
        int top;

        Stack(int size) {
            arr = new int[size];
            top = -1;
        }

        void push(int value) {
            if (top == arr.length - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = value;
        }

        int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int val = arr[top];
            top--;
            return val;
        }

        int peek() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top];
        }

        boolean isempty() {
            return top == -1;
        }

        boolean isfull() {
            return top == arr.length - 1;
        }

        int size() {
            return top + 1;
        }

        void display() {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println(stack.pop());
        stack.display();
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.isempty());
        System.out.println(stack.isfull());
        System.out.println(stack.size());
    }
}
