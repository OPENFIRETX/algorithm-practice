package MergeSort;


//归并排序
public class MergeSort {
    //递归方法实现
    public static void MergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);
    }

    public static void process(int[] arr, int L, int R) {
        if (L == R) return;
        int mid = L + ((R - L) >> 1);
        process(arr, L, mid);
        process(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;//新数组指针
        int leftIndex = L;
        int rightIndex = M + 1;
        while (leftIndex <= M && rightIndex <= R) {
            help[i++] = arr[leftIndex] <= arr[rightIndex] ? arr[leftIndex++] : arr[rightIndex++];
        }
        while (leftIndex <= M) {
            help[i++] = arr[leftIndex++];
        }
        while (rightIndex <= R) {
            help[i++] = arr[rightIndex++];
        }

        for (int j = 0; j < help.length; j++) {
            arr[L+j]=help[j];
        }

    }




}
