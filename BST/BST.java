public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return root = new Node(val);
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // search node
    public static boolean searchElement(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (root.data > key) {
            return searchElement(root.left, key);
        } else {
            return searchElement(root.right, key);
        }
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);

        if (searchElement(root, 6)) {
            System.out.println("\nFound");
        } else {
            System.out.println("\nNot found");
        }
    }
}