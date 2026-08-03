
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
            head.prev = null;
        }

        void deletelast() {
            if (tail == null) {
                return;
            }
            if (head == tail) {
                head = null;
                tail = null;
                return;
            }
            tail = tail.prev;
            tail.next = null;
        }

        void insertat(int key, int value) {
            if (key < 0) {
                return;
            }
            if (key == 0) {
                insertfirst(value);
                return;
            }
            Node temp = head;
            for (int i = 0; i < key - 1; i++) {
                if (temp == null) {
                    return;
                }
                temp = temp.next;
            }
            if (temp == null) {
                return;
            }
            if (temp.next == null) {
                insertlast(value);
                return;
            }
            Node newnode = new Node(value);
            newnode.next = temp.next;
            newnode.prev = temp;
            temp.next.prev = newnode;
            temp.next = newnode;
        }

        void deleteat(int key) {
            if (key < 0 || null == head) {
                return;
            }
            if (key == 0) {
                deletefirst();
                return;
            }
            Node temp = head;
            for (int i = 0; i < key; i++) {
                if (temp == null) {
                    return;
                }
                temp = temp.next;
            }
            if (temp == null) {
                return;
            }
            if (temp == tail) {
                deletelast();
                return;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
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

        list.deletefirst();
        System.out.println("deleted first element");
        list.displayforward();

        list.deletelast();
        System.out.println("deleted last element");
        list.displayforward();

        list.insertat(3, 45);
        System.out.println("Insert at index 3");
        list.displaybackward();
        list.displayforward();

        list.deleteat(2);
        System.out.println("delete at index 2");
        list.displaybackward();
        list.displayforward();
    }
}
