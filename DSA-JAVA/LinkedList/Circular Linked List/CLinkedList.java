
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
    }
}
