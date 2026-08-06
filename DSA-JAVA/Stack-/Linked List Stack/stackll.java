
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

        void push(int value) {
            Node newnode = new Node(value);
            newnode.next = top;
            top = newnode;
        }

        void display() {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.val + " ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.display();
    }
}
