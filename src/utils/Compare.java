package utils;

public class Compare {

    public static int getMaxAndIndex(int[] arr, int a, int b) {

        if (arr[a] >= arr[b]) {
            return a;
        } else{
            return b;
        }
    }
}
