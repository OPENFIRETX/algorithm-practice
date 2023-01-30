package listStructure;

public class listStructure {
    //单向链表
    public static class Node {

        public int value;
        public Node next;

        public Node(int data) {
            value = data;
        }

    }


    //双向
    public static class DoubleNode {
        public int value;
        public DoubleNode last;
        public DoubleNode next;

        public DoubleNode(int data){
            value = data;
        }
    }




}
