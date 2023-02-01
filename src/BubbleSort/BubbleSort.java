package BubbleSort;

import algorithm.Swap;

import java.util.Arrays;

public class BubbleSort {
    public static void sortMethods(int[] arr) {
        if (arr == null) {
            return;
        }

        //==========代码===========
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    Swap.swap(arr, j, j - 1);
                }
            }
        }


        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int i, int j) {
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 3, 4, 1, 12, 9, 7, 1};
        sortMethods(arr);
    }
}
