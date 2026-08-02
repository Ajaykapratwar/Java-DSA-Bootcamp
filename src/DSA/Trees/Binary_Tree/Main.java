package DSA.Trees.Binary_Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(in);
        tree.prettyDisplay();

        tree.preOrder();
        System.out.println();

        tree.inOrder();
        System.out.println();

        tree.postOrder();
        System.out.println();

        BST tree1 = new BST();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        tree1.populatedSorted(arr);

        tree1.display();
    }
}
