package LinkenList;

import sun.nio.cs.ext.MacHebrew;

public class LoopNode {

    //判断1个链是否有环
    public static Node getLoopNode(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }
        Node fasterPointer = head.next.next;
        Node slowerPointer = head.next;
        while (fasterPointer != slowerPointer) {
            if (fasterPointer.next.next == null || slowerPointer.next == null) {
                return null;
            }
            fasterPointer = fasterPointer.next.next;
            slowerPointer = slowerPointer.next;
        }
        fasterPointer = head;
        while (fasterPointer != slowerPointer) {
            fasterPointer = fasterPointer.next.next;
            slowerPointer = slowerPointer.next;
        }
        return fasterPointer;
    }

    public static Node noloop(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        //比较哪个长===============
        Node cur1 = head1;
        Node cur2 = head2;
        int n = 0;
        while (cur1.next != null) {
            n++;
            cur1 = cur1.next;
        }
        while (cur2.next != null) {
            n--;
            cur2 = cur2.next;
        }
        if (cur1 != cur2) {
            return null;
        }

        //长的头 变成cur1
        cur1 = n > 0 ? head1 : head2;
        cur2 = cur1 == head1 ? head2 : head1;
        n = Math.abs(n);
        while (n != 0) {
            n--;
            cur1 = cur1.next;
        }
        while (cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
}
