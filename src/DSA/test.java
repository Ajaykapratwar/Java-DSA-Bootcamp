package DSA;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);
        printList(result);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int length1 = 0, length2 = 0;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while(temp1 != null) {
            length1++;
            temp1 = temp1.next;
        }

        while(temp2 != null) {
            length2++;
            temp2 = temp2.next;
        }

        //System.out.println(length1 + "  " + length2);

        while(l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if(l1 != null && length1 != length2) {
                sum += l1.val;
                l1 = l1.next;
                length1--;
            }

            else if(l2 != null && length1 != length2) {
                sum += l2.val;
                l2 = l2.next;
                length2--;
            }

            else if(l1 != null && l2 != null && length1 == length2) {
                sum += l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
