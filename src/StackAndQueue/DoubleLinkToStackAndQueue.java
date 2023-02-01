package StackAndQueue;

public class DoubleLinkToStackAndQueue {
    //双向链表
    public static class Node<T> {
        public T value;
        public Node<T> last;
        public Node<T> next;

        public Node(T data) {
            value = data;
        }
    }

    //双向链表队列
    public static class DoubleLinkQueue<T> {
        public Node<T> head;
        public Node<T> tail;

        //从头部添加
        public void addFromHead(T value) {
            Node<T> cur = new Node<T>(value);
            if (head == null) {
                head = cur;
                tail = cur;
            } else {
                cur.next = head;
                head.last = cur;
                head = cur;
            }
        }

        //从尾部添加
        public void addFromBottom(T value) {
            Node<T> cur = new Node<T>(value);
            if (head == null) {
                head = cur;
                tail = cur;
            } else {
                cur.last = tail;
                tail.next = cur;
                tail = cur;
            }
        }

        //从头部弹出
        public T popFromHead() {
            if (head == null) {
                return null;
            }

            Node<T> cur = head;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                cur.next = null;
                head.last = null;
            }
            return cur.value;
        }

        //从尾部弹出
        public T popFromBottom() {
            if (tail == null) {
                return null;
            }

            Node<T> cur = tail;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.last;
                cur.last = null;
                tail.next = null;
            }
            return cur.value;
        }
    }

    //==============实现栈====

    public static class MyStack<T> {
        private DoubleLinkQueue<T> queue;

        public MyStack() {
            queue = new DoubleLinkQueue<T>();
        }

        public void push(T value) {
            queue.addFromHead(value);
        }

        public T pop() {
            return queue.popFromHead();
        }
    }

    //==============实现队列====
    public static class MyQueue<T> {
        private DoubleLinkQueue<T> queue;

        public MyQueue() {
            queue = new DoubleLinkQueue<T>();
        }

        public void push(T value) {
            queue.addFromHead(value);
        }

        public T poll() {
            return queue.popFromBottom();
        }
    }


}
