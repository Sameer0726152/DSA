
public class DCLinkedList {

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

    static class LinkedList {

        Node head;
        Node tail;

        void insertfirst(int value) {
            Node newnode = new Node(value);
            if (head == null) {
                head = newnode;
                tail = newnode;
                newnode.next = newnode;
                newnode.prev = newnode;
                return;
            }
            newnode.next = head;
            newnode.prev = tail;
            head.prev = newnode;
            tail.next = newnode;
            head = newnode;
        }

        void insertlast(int value) {
            Node newnode = new Node(value);
            if (head == null) {
                head = newnode;
                tail = newnode;
                newnode.next = newnode;
                newnode.prev = newnode;
                return;
            }
            newnode.prev = tail;
            newnode.next = head;
            tail.next = newnode;
            head.prev = newnode;
            tail = newnode;
        }

        void displayforward() {
            if (head == null) {
                return;
            }
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("");
        }

        void displaybackward() {
            if (head == null) {
                return;
            }
            Node temp = tail;
            do {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            } while (temp != tail);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertfirst(30);
        list.insertfirst(20);
        list.insertfirst(10);
        list.displayforward();
        list.displaybackward();

        list.insertlast(40);
        list.insertlast(50);
        list.insertlast(60);
        list.displayforward();
        list.displaybackward();
    }
}
