
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
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("");
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
            Node newnode = new Node(value);
            newnode.next = temp.next;
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

        void deleteat(int key) {
            if (key < 0) {
                return;
            }
            if (key == 0) {
                deletefirst();
                return;
            }
            Node temp = head;
            for (int i = 0; i < key - 1; i++) {
                if (temp == null) {
                    return;
                }
                temp = temp.next;
            }
            if (temp.next == null || temp.next.next == null) {
                return;
            }
            temp.next = temp.next.next;
        }

        void reverselist() {
            Node current = head;
            Node previous = null;
            Node next;
            while (current != null) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            head = previous;
        }

        int findmiddle() {
            if (head == null) {
                return -1;
            }
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }

        boolean iscycle() {
            if (head == null) {
                return false;
            }
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertlast(10);
        list.insertlast(20);
        list.insertlast(30);
        list.insertlast(40);
        list.insertlast(50);
        System.out.println("Inserted 5 elements");

        list.display();

        list.insertfirst(60);
        list.insertfirst(70);
        System.out.println("Inserted 2 elements at first");

        list.display();

        list.insertat(2, 55);
        System.out.println("Inserted an element at index 2");

        list.display();

        list.deletefirst();
        list.deletefirst();
        System.out.println("deleted 2 elements at start");

        list.display();

        list.deleteat(3);
        System.out.println("deleted element at index 3");

        list.display();

        list.deletelast();
        list.deletelast();
        System.out.println("deleted 2 elements at last");

        list.display();

        list.reverselist();
        System.out.println("reversing the list");

        list.display();

        System.out.println("Middle element is: " + list.findmiddle());
        System.out.println("Is there a cycle?: " + list.iscycle());
    }
}
