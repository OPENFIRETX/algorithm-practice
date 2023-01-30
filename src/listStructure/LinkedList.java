package listStructure;

public class LinkedList {

    public Node first;
    private Node current;

    private int length;

    //添加新结点
    public void add(int value) {
//        添加结点
        Node newNode = new Node(value);
//        如果没有结点
        if (first == null) {
            first = newNode;
            current = newNode;
        }
        //有结点
        else {

            current.next = newNode;
            current = newNode;
        }
        length++;
    }

    public void addFrom(int value, int index) {
        Node newNode = new Node(value);
        Node indexNode = first;
        for (int i = 0; i < index; i++) {
            indexNode = indexNode.next;
        }
        newNode.next = indexNode.next;
        indexNode.next = newNode;

        length++;
    }

    //翻转单向链表
    public Node reverseList(Node firstNode) {
        Node pre = null;
        Node next = null;

        while (firstNode!=null){
            next = firstNode.next;
            firstNode.next = pre;
            pre = firstNode;
            firstNode=next;
        }

        return pre;
    }

    //显示数据
    public void display() {
        Node node = first;

        while (node != null) {
            int value = node.data;
            System.out.println(value);
            node = node.next;
        }
        System.out.println("长度" + length);

    }

}
