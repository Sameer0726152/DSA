
import java.util.LinkedList;
import java.util.Queue;

public class tree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int countnodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countnodes(root.left) + countnodes(root.right);
    }

    static int countleaves(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countleaves(root.left) + countleaves(root.right);
    }

    static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    static void levelorder(Node root) {
        Queue<Node> q = new LinkedList<>();
        if (root == null) {
            return;
        }
        q.offer(root);
        while (!q.isEmpty()) {
            Node cur = q.poll();
            System.out.print(cur.data + " ");
            if (cur.left != null) {
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);
        root.left.left.left = new Node(70);
        System.out.println("Preorder Traversal:");
        preorder(root);
        System.out.println("\nInorder Traversal:");
        inorder(root);
        System.out.println("\nPostorder Traversal:");
        postorder(root);
        System.out.println("\nLevelorder Traversal:");
        levelorder(root);
        System.err.println("\n" + countnodes(root));
        System.err.println("\n" + countleaves(root));
        System.err.println("\n" + sum(root));
    }
}
