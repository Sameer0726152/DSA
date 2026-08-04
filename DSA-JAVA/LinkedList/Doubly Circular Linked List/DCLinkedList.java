
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

        void insertat(int key, int value) {
            if (key < 0) {
                return;
            }
            if (key == 0) {
                insertfirst(value);
                return;
            }
            if (head == null) {
                return;
            }
            Node temp = head;
            for (int i = 0; i < key; i++) {
                temp = temp.next;
                if (temp == head && i < key - 1) {
                    return;
                }
            }
            if (temp == head) {
                insertlast(value);
                return;
            }
            Node newnode = new Node(value);
            newnode.next = temp;
            newnode.prev = temp.prev;
            temp.prev.next = newnode;
            temp.prev = newnode;
        }

        void deletefirst() {
            if (head == null) {
                return;
            }
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }

        void deletelast() {
            if (head == null) {
                return;
            }
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }

        void deleteat(int key) {
            if (key < 0 || head == null) {
                return;
            }
            if (key == 0) {
                deletefirst();
                return;
            }
            Node temp = head;
            for (int i = 0; i < key; i++) {
                temp = temp.next;
                if (temp == head) {
                    return;
                }
            }
            if (temp == tail) {
                deletelast();
                return;
            }
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
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

        list.deletefirst();
        list.displayforward();

        list.deletelast();
        list.displayforward();

        list.insertat(1, 15);
        list.displayforward();

        list.deleteat(2);
        list.displayforward();
    }
}
