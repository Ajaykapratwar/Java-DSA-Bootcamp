package DSA.LinkedList;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }
    public void insertLast(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }
    public void insertPos(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index < 0 || index > size) {
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next, temp);
        temp.next.prev = node;
        temp.next = node;
        size++;
    }
    public int deleteFirst() {
        if (head == null) {
            return -1;
        }
        int x = head.val;
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return x;
    }
    public int deleteLast() {
        if (head == null) {
            return -1;
        }
        if (head.next == null) {
            return deleteFirst();
        }
        int x = tail.val;
        tail = tail.prev;
        tail.next = null;
        size--;
        return x;
    }
    public int deletePos(int index) {
        if (head == null) {
            return -1;
        }
        if (index < 0 || index >= size) {
            return -1;
        }
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        int x = temp.val;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
        return x;
    }
    public void display() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size: " + size);
    }
    public void displayRev() {
        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.val+" -> ");
            temp = temp.prev;
        }
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
