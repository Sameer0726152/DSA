
public class llqueue {

    private static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static class Queue {

        Node front;
        Node rear;
        int size;

        void enqueue(int value) {
            Node newnode = new Node(value);
            if (front == null) {
                front = newnode;
                rear = newnode;
                size++;
                return;
            }
            rear.next = newnode;
            rear = newnode;
            size++;
        }

        int dequeue() {
            if (front == null) {
                System.out.println("Queue Underflow");
                return -1;
            }
            int value = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
            return value;
        }

        int peek() {
            if (front == null) {
                System.out.println("Queue empty");
                return -1;
            }
            return front.data;
        }

        boolean isEmpty() {
            return front == null;
        }

        int size() {
            return size;
        }

        void display() {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println(q.dequeue());
        q.display();

        q.enqueue(40);
        q.display();

        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
    }
}
