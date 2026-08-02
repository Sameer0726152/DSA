
public class DLinkedList {

    static class Node {

        int data;
        Node next;
        Node prev;

        Node(int value) {
            data = value;
            next = null;
            prev = null;
        }
    }

    static class LinkedList {

        Node head;
        Node tail;

        void insertfirst(int value) {
            Node newnode = new Node(value);
            if (head == null) {
                head = newnode;
                tail = newnode;
                return;
            }
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }

        void insertlast(int value) {
            Node newnode = new Node(value);
            if (tail == null) {
                head = newnode;
                tail = newnode;
                return;
            }
            newnode.prev = tail;
            tail.next = newnode;
            tail = newnode;
        }

        void displayforward() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("");
        }

        void displaybackward() {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertlast(40);
        list.insertlast(50);
        list.insertlast(60);
        System.out.println("3 Nodes added at last");

        list.displaybackward();

        list.insertfirst(30);
        list.insertfirst(20);
        list.insertfirst(10);
        System.out.println("3 Nodes added at front");

        list.displayforward();

    }
}
