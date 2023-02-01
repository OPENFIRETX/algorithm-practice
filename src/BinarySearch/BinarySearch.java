package BinarySearch;

import java.util.Arrays;

public class BinarySearch {

    public static int sortMethods(int[] arr, int target) {
        //==========代码===========
        if (arr == null) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 3, 4, 1,4,4, 12, 9, 7, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
       int res =  sortMethods(arr, 4);
        System.out.println(res);
    }

}
