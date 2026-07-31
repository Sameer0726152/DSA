
public class linkedlist {

    static class Node {

        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    static class LinkedList {

        Node head;

        void display() {
            Node temp = head;
            while (temp != null) {
                System.err.print(temp.data + " ");
                temp = temp.next;
            }
            System.err.println("");
        }

        void insertfirst(int value) {
            Node newnode = new Node(value);
            newnode.next = head;
            head = newnode;
        }

        void insertlast(int value) {
            Node newnode = new Node(value);
            if (head == null) {
                head = newnode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }

        void deletefirst() {
            if (head == null) {
                return;
            }
            head = head.next;
        }

        void deletelast() {
            Node temp = head;
            if (head == null) {
                return;
            }
            if (head.next == null) {
                head = null;
                return;
            }
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertlast(10);
        list.insertlast(20);
        list.insertlast(30);
        list.insertlast(40);
        list.insertlast(50);

        list.display();

        list.insertfirst(60);
        list.insertfirst(70);

        list.display();

        list.deletefirst();
        list.deletefirst();

        list.display();

        list.deletelast();
        list.deletelast();

        list.display();
    }
}
