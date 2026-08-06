
public class stackll {

    static class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class Stack {

        Node top;
        int size;

        void push(int value) {
            Node newnode = new Node(value);
            newnode.next = top;
            top = newnode;
            size++;
        }

        int pop() {
            if (top == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int value = top.val;
            top = top.next;
            size--;
            return value;
        }

        int peek() {
            if (top == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return top.val;
        }

        boolean isempty() {
            return top == null;
        }

        int size() {
            return size;
        }

        void display() {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println(stack.pop());
        stack.display();

        stack.push(30);
        System.out.println(stack.peek());
        stack.display();

        System.out.println(stack.isempty());
        System.out.println(stack.size());
    }
}
