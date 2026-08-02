package DSA.Stack_Queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        data[end] = item;
        end = (end + 1) % data.length; // Increment and wrap around
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot remove from empty Queue!!");
        }
        int removed = data[front];
        front = (front + 1) % data.length; // Increment and wrap around
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot give front element from empty queue");
        }
        return data[front];
    }

    public void display() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot display empty queue");
        }
        int i = front;
        System.out.print("Queue: ");
        do {
            System.out.print(data[i] + " -> ");
            i = (i + 1) % data.length;
        } while (i != end);
        System.out.println("END");
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
