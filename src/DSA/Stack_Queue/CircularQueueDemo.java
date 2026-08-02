package DSA.Stack_Queue;

public class CircularQueueDemo {
    public static void main(String[] args) throws Exception{
        CircularQueue queue = new CircularQueue(5);

        queue.insert(12);
        queue.insert(45);
        queue.insert(57);
        queue.insert(3);
        queue.insert(99);

        queue.display();

        System.out.println(queue.front());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.insert(31);
        queue.insert(5);
        queue.insert(123);
        queue.insert(65);

        queue.display();
    }
}
