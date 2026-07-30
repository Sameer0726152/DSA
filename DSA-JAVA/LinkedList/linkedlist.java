
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
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(35);
        int sum = 0;
        first.next = second;
        second.next = third;
        list.head = first;
        Node temp = list.head;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        System.err.println("Sum: " + sum);
    }
}
