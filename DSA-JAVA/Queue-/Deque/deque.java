
public class deque {

    static class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private static class deques {

        Node front;
        Node rear;
        int size;

        void insertfront(int value) {
            Node newnode = new Node(value);
            if (front == null) {
                front = newnode;
                rear = newnode;
                size++;
                return;
            }
            newnode.next = front;
            front.prev = newnode;
            front = newnode;
            size++;
        }

        void insertrear(int value) {
            Node newnode = new Node(value);
            if (rear == null) {
                front = newnode;
                rear = newnode;
                size++;
                return;
            }
            newnode.prev = rear;
            rear.next = newnode;
            rear = newnode;
            size++;
        }

        int deletefront() {
            if (front == null) {
                System.out.println("Queue empty");
                return -1;
            }
            int value = front.data;
            if (front == rear) {
                front = null;
                rear = null;
                size--;
                return -1;
            }
            front = front.next;
            front.prev = null;
            size--;
            return value;
        }

        int deleterear() {
            if (rear == null) {
                System.out.println("Queue empty");
                return -1;
            }
            int value = rear.data;
            if (front == rear) {
                front = null;
                rear = null;
                size--;
                return -1;
            }
            rear = rear.prev;
            rear.next = null;
            size--;
            return value;
        }

        void display() {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("");
        }

        int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        deques deq = new deques();
        deq.insertfront(10);
        deq.insertrear(20);
        deq.insertrear(30);
        deq.display();

        deq.insertfront(5);
        deq.insertfront(2);
        System.out.println(deq.deletefront());
        System.out.println(deq.deleterear());
        deq.display();

        System.out.println(deq.size());
    }
}
