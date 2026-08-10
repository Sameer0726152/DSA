
public class deque {

    static class Deque {

        int[] arr;
        int front;
        int rear;
        int size;

        Deque(int capacity) {
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        void insertfront(int value) {
            if (size == 0) {
                front = 0;
                rear = 0;
                size++;
                arr[front] = value;
                return;
            }
            front = (front - 1 + arr.length) % arr.length;
            arr[front] = value;
            size++;
        }

        void insertrear(int value) {
            if (size == arr.length) {
                System.out.println("Queue Full");
                return;
            }
            rear = (rear + 1) % arr.length;
            arr[rear] = value;
            size++;
        }

        int deletefirst() {
            if (size == 0) {
                System.out.println("Queue Empty");
                return -1;
            }
            int value = arr[front];
            if (front == rear) {
                front = 0;
                rear = -1;
                size--;
                return value;
            }
            front = (front + 1) % arr.length;
            size--;
            return value;
        }

        int deleterear() {
            if (size == 0) {
                System.out.println("Queue Empty");
                return -1;
            }
            int value = arr[rear];
            if (front == rear) {
                front = 0;
                rear = -1;
                size--;
                return value;
            }
            rear = (rear - 1 + arr.length) % arr.length;
            size--;
            return value;
        }

        void display() {
            int index = front;
            for (int i = 0; i < size; i++) {
                System.out.print(arr[index] + " ");
                index = (index + 1) % arr.length;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Deque deq = new Deque(5);
        deq.insertfront(30);
        deq.insertfront(20);
        deq.insertfront(10);
        deq.display();

        deq.insertrear(40);
        deq.insertrear(50);
        deq.insertrear(60);
        deq.display();

        deq.deletefirst();
        deq.deletefirst();
        deq.display();

        deq.deleterear();
        deq.deleterear();
        deq.display();

    }
}
