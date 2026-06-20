class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class binarytree {

    // Recursive function
    static int maxDepth(Node root) {
        // Base case
        if (root == null) {
            return 0;
        }

        // Recursive calls
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        // Return max depth
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(5);

        root.left.left = new Node(3);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Max Depth = " + maxDepth(root));
    }
}