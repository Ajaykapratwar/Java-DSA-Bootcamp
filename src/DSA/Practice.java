package DSA;

import java.util.Scanner;

public class Practice {

    public Practice() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root node : ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(root, scanner);
    }

    private static void populate(Node node, Scanner scanner) {
        System.out.println("Do you want to enter left of -> " + node.value);
        boolean left = scanner.nextBoolean();

        if(left) {
            System.out.println("Enter the value of left of -> " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(node.left, scanner);
        }

        System.out.println("Do you want to enter right of -> " + node.value);
        boolean right = scanner.nextBoolean();

        if(right) {
            System.out.println("Enter the value of right of -> " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(node.right, scanner);
        }
    }

    public void display() {
        display(root, "");
    }

    private static void display(Node node, String indent) {
        if(node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
}
