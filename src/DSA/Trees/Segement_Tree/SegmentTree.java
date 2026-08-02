package DSA.Trees.Segement_Tree;

public class SegmentTree {

    public static void main(String[] args) {
        int[] arr = {3,8,7,6,-2,-8,4,9};

        SegmentTree tree = new SegmentTree(arr);

        tree.printTree();
    }



    private static class Node {
        int value;
        Node left;
        Node right;
        int start;
        int end;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        // create tree using this array
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if(start == end) {
            // leaf node
            Node leaf = new Node(start, end);
            leaf.value = arr[start];
            return leaf;
        }

        // create new node with index you are at

        Node node = new Node(start, end);

        int mid = (start + end) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.value = node.left.value + node.right.value;
        return node;
    }

    public void printTree() {
        printTree(root, 0);
    }

    private void printTree(Node node, int depth) {
        if (node == null) return;

        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }

        System.out.println("[" + node.start + ", " + node.end + "] -> " + node.value);

        printTree(node.left, depth + 1);
        printTree(node.right, depth + 1);
    }

    public int query(int qsi, int qei) {
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if(node.start >= qsi && node.end <= qei) {
            // node is lying inside query
            return node.value;
        }
        else if(node.start > qei && node.end < qsi) {
            // completely outside
            return 0;
        }
        else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    public void update(int index, int val) {
        this.root.value = update(this.root, index, val);
    }
    private int update(Node node, int index, int val) {
        if (index >= node.start&& index <= node.end){
            if(index == node.start && index == node.end) {
                node.value = val;
                return node.value;
            } else {
                int leftAns = update(node.left, index, val);
                int rightAns = update(node.right, index, val);
                node.value = leftAns + rightAns;
                return node.value;
            }
        }
        return node.value;
    }
}
