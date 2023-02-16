package BinaryTree;

import java.util.Stack;

public class BiTree {

    public static class Node {
        int value;
        Node leftChild = null;
        Node rightChild = null;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void pre(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.value);
        pre(head.leftChild);
        pre(head.rightChild);
    }


    public static void preStack(Node head) {
        System.out.println("pres-order");
        if (head != null) {
            Stack<Node> stack = new Stack<Node>();
            stack.push(head);
            while (!stack.isEmpty()) {
                head = stack.pop();
                System.out.println(head.value);
                if (head.rightChild != null) {
                    stack.push(head.rightChild);
                }
                if (head.leftChild != null) {
                    stack.push(head.leftChild);
                }
            }
        }
        System.out.println("pres-order-over");
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        node1.leftChild = node2;
        node1.rightChild = node3;
        node2.leftChild = node4;
        node2.rightChild = node5;
        node3.leftChild = node6;
        node3.rightChild = node7;

        preStack(node1);
    }
}
