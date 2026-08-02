package DSA.Stack_Queue;

import DSA.LinkedList.LL;

public class Stack_Using_LL {
    private Node top = null;

    public void push(int n) {
        Node node = new Node(n);

        node.next = top;
        top = node;
    }

    public int pop() {
        if(top == null) {
            System.out.println("Empty Stack");
            return -1;
        }
        int n = top.val;
        top = top.next;
        return n;
    }

    public int toppest() {
        if(top == null) {
            System.out.println("Empty Stack");
            return -1;
        }
        return top.val;
    }

    private class Node {
        private int val;
        private Stack_Using_LL.Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Stack_Using_LL.Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
