package DSA.Trees.Binary_Tree;

public class BST {

    public BST() {

    }

    private class Node {
        private int height;
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }

        return 1 + Math.max(height(node.left), height(node.right));
    }


    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if(node == null) {
            node = new Node(value);
            return node;
        }
        if(value < node.value) {
            node.left = insert(value, node.left);
        }

        if(value > node.value) {
            node.right = insert(value, node.right);
        }

        if(node.value == value) {
            System.out.println("The node is already present");
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void populate(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }

    public void populatedSorted(int[] arr) {
        populatedSorted(arr, 0, arr.length);
    }

    private void populatedSorted(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        this.insert(arr[mid]);

        populatedSorted(arr, start, mid);
        populatedSorted(arr, mid + 1, end);
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if(node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root Node : ");
    }

    private void display(Node node, String details) {
        if(node == null) {
            return;
        }

        System.out.println(details + node.getValue());
        display(node.left, "Left Child of " + node.getValue() + " : ");
        display(node.right, "Right Child of " + node.getValue() + " : ");
    }
}
