package selectionSort;


import java.util.Arrays;

public class test {

    public static void selectionSort(int[] arr) {
        int minIndex;
        int length = arr.length;
        if (arr==null||length<2){
            return;
        }
        for (int i = 0; i < length; i++) {
            minIndex=i;
            for (int j = i+1; j < length; j++) {
                minIndex=arr[j]<arr[minIndex]?j:minIndex;
            }
            swap(arr,i,minIndex);
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
    selectionSort(arr);
    }


}
