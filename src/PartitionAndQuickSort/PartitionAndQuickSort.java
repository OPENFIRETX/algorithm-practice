package PartitionAndQuickSort;

import utils.Swap;

public class PartitionAndQuickSort {
    public static void process3(int[] arr, int L, int R) {
        if (L >= R) {
            return;
        }
        int random = L+(int)(Math.random()*(R-L+1));
        swap(arr,random,R);
        int[] equalArea = netherlandsFlag(arr,L,R);
        process3(arr,L,equalArea[0]-1);
        process3(arr,equalArea[1]+1,R);
    }

    public static int[] netherlandsFlag(int[] arr, int L, int R) {
        if (L > R) {
            return new int[]{-1, -1};
        }
        if (L == R) {
            return new int[]{L, R};
        }

        int less = L - 1; //小于区域右边界
        int more = R;
        int index = L;

        while (index < more) {
            if (arr[index] < arr[R]) {
                swap(arr, arr[index], arr[less + 1]);
                less++;
                index++;

            } else if (arr[L] == arr[R]) {
                index++;
            } else {
                swap(arr, arr[index], arr[more - 1]);
                more--;

            }
        }

        swap(arr, more, R);
        return new int[]{less + 1, more};

    }

    public static void swap(int[] arr, int i, int j) {
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }

}
