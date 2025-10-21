import java.util.ArrayList;
import java.util.List;

public class AVL {
    Node root;

    AVL() {
        root = null;
    }

    int height(Node node) {
        if (node == null) return 0;
        return node.height;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    void updateHeight(Node node) {
        node.height = 1 + max(height(node.left), height(node.right));
    }

    int getBalance(Node node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        updateHeight(y);
        updateHeight(x);
        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        updateHeight(x);
        updateHeight(y);
        return y;
    }

    Node insert(Node node, int key) {
        if (node == null) return new Node(key);

        if (key < node.val)
            node.left = insert(node.left, key);
        else if (key > node.val)
            node.right = insert(node.right, key);
        else
            return node; // No duplicates

        updateHeight(node);

        int balance = getBalance(node);

        // Left Left Case
        if (balance > 1 && key < node.left.val)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key > node.right.val)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key > node.left.val) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.val) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    void insert(int key) {
        root = insert(root, key);
    }

    void inorder(Node node, List<Integer> list) {
        if (node != null) {
            inorder(node.left, list);
            list.add(node.val);
            inorder(node.right, list);
        }
    }

    List<Integer> inorder() {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    void printTree(Node node, int level) {
        if (node != null) {
            printTree(node.right, level + 1);
            System.out.println("    ".repeat(level) + node.val);
            printTree(node.left, level + 1);
        }
    }

    void printTree() {
        printTree(root, 0);
    }
}
