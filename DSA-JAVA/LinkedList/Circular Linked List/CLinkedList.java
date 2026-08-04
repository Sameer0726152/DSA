
public class CLinkedList {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {

        Node tail;

        void insertfirst(int value) {
            Node newnode = new Node(value);
            if (tail == null) {
                tail = newnode;
                newnode.next = newnode;
                return;
            }
            newnode.next = tail.next;
            tail.next = newnode;
        }

        void insertlast(int value) {
            Node newnode = new Node(value);
            if (tail == null) {
                tail = newnode;
                newnode.next = newnode;
                return;
            }
            newnode.next = tail.next;
            tail.next = newnode;
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
            if (tail == null) {
                return;
            }
            if (key == 0) {
                insertfirst(value);
                return;
            }
            Node temp = tail.next;
            for (int i = 0; i < key - 1; i++) {
                if (temp == tail) {
                    return;
                }
                temp = temp.next;
            }
            if (temp == tail) {
                insertlast(value);
                return;
            }
            Node newnode = new Node(value);
            newnode.next = temp.next;
            temp.next = newnode;
        }

        void deletefirst() {
            if (tail == null) {
                return;
            }
            if (tail.next == tail) {
                tail = null;
                return;
            }
            tail.next = tail.next.next;
        }

        void deletelast() {
            if (tail == null) {
                return;
            }
            if (tail.next == tail) {
                tail = null;
                return;
            }
            Node temp = tail.next;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = tail.next;
            tail = temp;
        }

        void deleteat(int key) {
            if (key < 0 || tail == null) {
                return;
            }
            if (key == 0) {
                deletefirst();
                return;
            }
            Node temp = tail.next;
            for (int i = 0; i < key - 1; i++) {
                if (temp == tail) {
                    return;
                }
                temp = temp.next;
            }
            if (temp == tail) {
                return;
            }
            if (temp.next == tail) {
                deletelast();
                return;
            }
            temp.next = temp.next.next;
        }

        void display() {
            if (tail == null) {
                return;
            }
            Node temp = tail.next;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != tail.next);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertfirst(30);
        list.insertfirst(20);
        list.insertfirst(10);
        list.display();

        list.insertlast(40);
        list.insertlast(50);
        list.insertlast(60);
        list.display();

        list.deletefirst();
        list.deletefirst();
        list.display();

        list.deletelast();
        list.deletelast();
        list.display();

        list.insertat(1, 25);
        list.insertat(2, 45);
        list.display();

        list.deleteat(2);
        list.deleteat(2);
        list.display();
    }
}
