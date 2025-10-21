public class Node {
    int val;
    Node left;
    Node right;
    int height;

    Node (int key){
        val = key;
        left = right = null;
        height = 1;
    }
}
