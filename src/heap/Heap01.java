package heap;

import utils.Compare;
import utils.Swap;

import java.util.Arrays;

public class Heap01 {

    public static class MyMaxHeap {

        private int[] heap;
        private final int limit;
        private int heapSize;

        public MyMaxHeap(int limit) {
            this.heap = new int[limit];
            this.limit = limit;
            this.heapSize = 0;
        }

        public void push(int value) {
            if (heapSize == limit) {
                throw new RuntimeException("heap full");
            }
            heap[heapSize] = value;
            heapInsert(heap, heapSize++);
        }


        private void heapInsert(int[] arr, int index) {
            while (arr[index] > arr[(index - 1) / 2]) {
                Swap.swap(heap, index, (index - 1) / 2);
                index = (index - 1) / 2;
            }
        }


        public int popMax() {
            int max = heap[0];

            Swap.swap(heap, 0, --heapSize);
            heapify(heap, 0, heapSize);
            return max;
        }

        public void heapify(int[] arr, int index, int heapSize) {
            int left = index * 2 + 1;
            while (left < heapSize) {
                int maxIndex;
                if (left + 1 < heapSize) {
                    maxIndex = Compare.getMaxAndIndex(arr, left, left + 1);
                    maxIndex = Compare.getMaxAndIndex(arr, maxIndex, index);
                } else {
                    maxIndex = Compare.getMaxAndIndex(arr, left, index);
                }

                //老师方法
//                maxIndex = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
//                maxIndex = arr[maxIndex] > arr[index] ? maxIndex : index;
//
                if (maxIndex == index) {
                    break;
                }
                Swap.swap(arr, index, maxIndex);
                index = maxIndex;
                left = index * 2 + 1;
            }
        }

        public void heapSort(int[] arr) {
            if (arr == null || arr.length < 2) {
                return;
            }

//            将数组变成大根堆===============
            //从上到下（一个一个添加到数组）
            for (int i = 0; i < arr.length; i++) { //O(N)
                heapInsert(arr, i);  //O(logN)
            }

            //从下岛上(拿到完整数组)
            for (int i = arr.length; i >= 0; i--) {//O(N)
                heapify(arr, i, arr.length);
            }
//            将数组变成大根堆=======================

            int heapSize = arr.length;
            Swap.swap(arr, 0, --heapSize);

            //O(N*logN)
            while (heapSize > 0) {
                heapify(arr, 0, heapSize);//O(logN)
                Swap.swap(arr, 0, --heapSize);//O(1)
            }

        }

    }

    public static void main(String[] args) {
        MyMaxHeap heap = new MyMaxHeap(5);
        heap.push(6);
        heap.push(2);
        heap.push(1);
        heap.push(4);
        heap.push(3);

        System.out.println(Arrays.toString(heap.heap));

        int max = heap.popMax();

        System.out.println(max);
        System.out.println(Arrays.toString(heap.heap));

    }



}
