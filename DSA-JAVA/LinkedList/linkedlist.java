
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
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertlast(10);
        list.insertlast(20);
        list.insertlast(30);
        list.insertlast(40);
        list.insertlast(50);
        Node temp = list.head;
        while (temp != null) {
            System.err.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
