package DSA.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val)    {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertPos(int val, int index) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            insertFirst(val);
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

        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;

        size++;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
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

    public int deleteFirst() {
        if (head == null) {
            return -1;
        }
        int x = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return x;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        int x = tail.val;
        tail = temp;
        tail.next = null;
        size--;
        return x;
    }

    public int deletePos(int index) {
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
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        int x = temp.next.val;
        temp.next = temp.next.next;
        size--;
        return x;
    }

    public int get(int index) {
        if(index == size) return tail.val;
        if(index >= size || index < 0) {
            System.out.println("Invalid Index");
            return -1;
        }
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void insertRec(int val, int index) {
        head = insertRec(head, val, index);
    }

    public Node insertRec(Node temp, int val, int index) {
        if(index == 0) {
            Node node = new Node(val, temp);
            size++;
            return node;
        }
        temp.next = insertRec(temp.next, val, index - 1);
        return temp;
    }

    public void middleNode() {
        Node temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        int middle = (count / 2) + 1;
        for(int i = 1; i <= middle-1; i++) {
            temp = temp.next;
        }
    }
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
