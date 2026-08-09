
public class queue {

    private static class Queue {

        int[] arr;
        int front;
        int rear;
        int size;

        Queue(int capacity) {
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        void enqueue(int value) {
            if (size == arr.length) {
                System.out.println("Queue Overflow");
                return;
            }
            rear = (rear + 1) % arr.length;
            arr[rear] = value;
            size++;
        }

        int dequeue() {
            if (size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            }
            int value = arr[front];
            front = (front + 1) % arr.length;
            size--;
            return value;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue Underflow");
                return -1;
            }
            return arr[front];
        }

        boolean isEmpty() {
            return size == 0;
        }

        boolean isFull() {
            return size == arr.length;
        }

        int size() {
            return size;
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            int index = front;
            for (int i = 0; i < size; i++) {
                System.out.print(arr[index] + " ");
                index = (index + 1) % arr.length;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println(q.dequeue());
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);

        q.display();

        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        System.out.println(q.size());
    }
}
