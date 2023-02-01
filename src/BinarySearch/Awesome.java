package BinarySearch;

import java.util.Arrays;

//局部最小值
public class Awesome {
    public static int sortMethods(int[] arr) {
        //==========代码===========
        if (arr == null||arr.length==0) {
            return -1;
        }
        if (arr.length==1||arr[0]<arr[1]){
            return 0;
        }
        if (arr[arr.length-1]<arr[arr.length-2]){
            return arr.length-1;
        }

        int left = 1;
        int right = arr.length - 2;
        int mid = 0;


        while (left <= right) {
            mid = (left + right) / 2;

            if (arr[mid]>arr[mid-1]){
                right=mid-1;
            } else if (arr[mid]>arr[mid+1]) {
                left=mid+1;
            }else {
                return mid;
            }

        }
        return mid;

    }

    public static void main(String[] args) {
        int[] arr = {15, 8,3, 4, 2, 4, 8, 5, 4, 12, 9, 7, 9};
        System.out.println(Arrays.toString(arr));
        int res = sortMethods(arr);
        System.out.println(res);

    }
}
