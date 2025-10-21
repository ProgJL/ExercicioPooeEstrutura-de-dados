public class App {
    public static void main(String[] args) throws Exception {
         int[] elements = {1, 2, 3, 10, 4, 9, 7, 8, 6};

        // BST
        System.out.println("Arvore Binaria de Busca (BST):");
        BST bst = new BST();
        for (int el : elements) {
            bst.insert(el);
        }
        bst.printTree();
        System.out.println("\nInorder BST: " + bst.inorder());

        // AVL
        System.out.println("\nArvore AVL:");
        AVL avl = new AVL();
        for (int el : elements) {
            avl.insert(el);
        }
        avl.printTree();
        System.out.println("\nInorder AVL: " + avl.inorder());
    }
}

