package DSA.Stack_Queue;

public class QueueDemo {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);

        queue.insert(67);
        queue.insert(32);
        queue.insert(89);
        queue.insert(10);
        queue.insert(22);

        System.out.println(queue.front());
        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        System.out.println(queue.front());
    }
}
