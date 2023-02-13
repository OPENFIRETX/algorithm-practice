package LinkenList;

public class Code01__LinkedListMid {

    public static class Node {
        public int value;
        public Node next;

        public Node(int v) {
            value = v;
        }
    }

    //奇数返回中点 偶数返回上中点
    public static Node midOrUpMidNode(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        Node pointerSlow = head;
        Node pointerQuick = head;
        pointerQuick = pointerQuick.next.next;
        pointerSlow = pointerSlow.next;

        while (head.next != null || head.next.next != null) {
            pointerQuick = pointerQuick.next.next;
            pointerSlow = pointerSlow.next;
        }

        return pointerSlow;
    }

    //奇数返回中点 偶数返回下中点


}
