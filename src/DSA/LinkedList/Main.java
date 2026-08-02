package DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
//        DLL dll = new DLL();
//        dll.insertLast(1);
//        dll.insertLast(2);
//        dll.insertLast(3);
//        dll.insertLast(4);
//        dll.insertLast(5);
//        dll.insertLast(6);
//        dll.display();
//
//        System.out.println(dll.deletePos(0));
//        dll.display();
//        dll.displayRev();

        LL ll = new LL();
        ll.insertLast(3);
        ll.insertLast(5);
        ll.insertLast(9);
        ll.insertLast(1);
        ll.display();

        ll.insertRec(7, 3);
        ll.display();
//
//        ll.middleNode();
//
//        System.out.println(ll.get(2));

        System.out.println(6/2);
    }
}
