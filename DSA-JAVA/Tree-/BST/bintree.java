
public class bintree {

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

    static boolean searchbst(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return searchbst(root.left, key);
        }
        return searchbst(root.right, key);
    }

    static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    static int minimum(Node root) {
        if (root == null) {
            return -1;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    static int maximum(Node root) {
        if (root == null) {
            return -1;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    static Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int minValue = minimum(root.right);
                root.data = minValue;
                root.right = delete(root.right, minValue);
            }
        }
        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static int count = 0;
    static int answer = -1;

    static void kthsmallest(Node root, int k) {
        if (root == null) {
            return;
        }
        kthsmallest(root.left, k);
        count++;
        if (count == k) {
            answer = root.data;
            return;
        }
        kthsmallest(root.right, k);
    }

    static void reset() {
        count = 0;
        answer = -1;
    }

    static void kthlargest(Node root, int k) {
        if (root == null) {
            return;
        }
        kthlargest(root.right, k);
        count++;
        if (count == k) {
            answer = root.data;
            return;
        }
        kthlargest(root.left, k);
    }

    static boolean isvalid(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data < min || root.data > max) {
            return false;
        }
        return isvalid(root.left, min, root.data) && isvalid(root.right, root.data, max);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 10);
        inorder(root);
        System.out.println("\nIs 60 present: " + searchbst(root, 60));
        System.out.println("Minimum and Maximum values are: " + minimum(root) + " and " + maximum(root));
        System.out.println("Deleting 20");
        root = delete(root, 20);
        inorder(root);
        root = insert(root, 20);
        System.out.println("\nInserting 20");
        inorder(root);
        kthsmallest(root, 3);
        System.out.println("\n3rd smallest element is: " + answer);
        reset();
        kthlargest(root, 3);
        System.out.println("3rd largest element is: " + answer);
        System.out.println("Is the tree valid BST: " + isvalid(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
