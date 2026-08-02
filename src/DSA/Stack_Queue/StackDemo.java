package DSA.Stack_Queue;

public class StackDemo {
//    public static void main(String[] args) throws StackException {
//        CustomStack stack = new CustomStack(5);
//
//        stack.push(5);
//        stack.push(2);
//        stack.push(9);
//        stack.push(13);
//        stack.push(26);
//
//        System.out.println(stack.peek());
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
//        System.out.println(stack.peek());
//    }

    public static void main(String[] args) {
        Stack_Using_LL stack = new Stack_Using_LL();

        stack.push(3);
        stack.push(5);
        stack.push(12);
        stack.push(9);
        stack.push(47);

        System.out.println("Top : " + stack.toppest());

        System.out.println("Pop : " + stack.pop());
        System.out.println("Pop : " + stack.pop());

        System.out.println("Top : " + stack.toppest());

        System.out.println("Pop : " + stack.pop());
        stack.push(20);

        System.out.println("Top : " + stack.toppest());
    }
}
