import java.util.ArrayList;
import java.util.List;

public class BST {
    Node root;

    BST() {
        root = null;
    }

    int height(Node node) {
        if (node == null) return 0;
        return node.height;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    Node insert(Node node, int key) {
        if (node == null) return new Node(key);

        if (key < node.val)
            node.left = insert(node.left, key);
        else if (key > node.val)
            node.right = insert(node.right, key);

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
