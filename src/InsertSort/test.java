package InsertSort;

import java.util.Arrays;

public class test {

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j-1);
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap2(int[] arr, int i, int j) {
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }


    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 3, 4, 1, 12, 9, 7, 1};
        insertionSort(arr);
    }


}
