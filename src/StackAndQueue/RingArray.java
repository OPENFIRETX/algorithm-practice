package StackAndQueue;

public class RingArray {

    //数组结构实现队列

    public static class MyQueue {
        private int[] arr;
        private int pushi;
        private int polli;
        private int size;
        private final int limit;

        public MyQueue(int limit) {
            arr = new int[limit];
            pushi = 0;
            polli = 0;
            size = 0;
            this.limit = limit;
        }

        public void push(int value) {
            if (size == limit) {
                throw new RuntimeException("队列满");
            }
            size++;
            arr[pushi] = value;
            pushi = nextIndex(pushi);

        }








        public int pop() {
            if (size == 0) {
                throw new RuntimeException("队列空");
            }
            size--;
            int pollValue = arr[polli];
            polli = nextIndex(polli);
            return pollValue;

        }


        public int nextIndex(int i) {
            if (i < limit - 1) {
                return i + 1;
            } else {
                return 0;
            }
        }

    }


}
