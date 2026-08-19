
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

    static int height(Node root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    static int maxvalue(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maxvalue(root.left), maxvalue(root.right)));
    }

    static int minvalue(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minvalue(root.left), minvalue(root.right)));
    }

    static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        return search(root.left, key) || search(root.right, key);
    }

    static int countonechild(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if ((root.left != null) ^ (root.right != null)) {
            count = 1;
        }
        return count + countonechild(root.left) + countonechild(root.right);
    }

    static boolean issametree(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.data != root2.data) {
            return false;
        }
        return issametree(root1.left, root2.left) && issametree(root1.right, root2.right);
    }

    static boolean ismirror(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.data != right.data) {
            return false;
        }
        return ismirror(left.left, right.right) && ismirror(left.right, right.left);
    }

    static boolean issymmetric(Node root) {
        if (root == null) {
            return true;
        }
        return ismirror(root.left, root.right);
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
        Node root1 = new Node(10);
        root1.left = new Node(20);
        root1.right = new Node(30);
        root1.left.left = new Node(40);
        root1.left.right = new Node(50);
        root1.right.right = new Node(60);
        root1.left.left.left = new Node(70);

        Node root2 = new Node(10);
        root2.left = new Node(20);
        root2.right = new Node(30);
        root2.left.left = new Node(40);
        root2.left.right = new Node(50);
        root2.right.right = new Node(60);
        root2.left.left.left = new Node(70);
        System.out.println("Preorder Traversal:");
        preorder(root1);
        System.out.println("\nInorder Traversal:");
        inorder(root1);
        System.out.println("\nPostorder Traversal:");
        postorder(root1);
        System.out.println("\nLevelorder Traversal:");
        levelorder(root1);
        System.out.println("\n Total Nodes: " + countnodes(root1));
        System.out.println("\n Total Leaves: " + countleaves(root1));
        System.out.println("\n Sum of all Nodes: " + sum(root1));
        System.out.println("\n Height of the Tree: " + height(root1));
        System.out.println("\n Is node 30 present?: " + search(root1, 20));
        System.out.println("\n Maximum value: " + maxvalue(root1));
        System.out.println("\n Minimum value: " + minvalue(root1));
        System.out.println("\n Total nodes with 1 child: " + countonechild(root1));
        System.out.println("\n Are the 2 trees the same?: " + issametree(root1, root2));
        System.out.println("\n Is the 1st tree Symmetric?: " + issymmetric(root1));
    }
}
