package BinarySearch;

//找到两个出现奇数次的数
public class PrintOddTimesNum2 {

    public static void PrintOddTimesNum2(int[] arr) {
        //==========代码===========
        int eor = 0;
        //异或所有 找到a^b
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        //找到不同位 即eor 为 1 的位
        int rightOne = eor & ((~eor) + 1);
        int onlyOne = 0;  //

        for (int i = 0; i < arr.length; i++) {
            //arr[i] & rightOne 每一位都是 1  1
            // ！=0 说明 1那一位  都是1
            if ((arr[i] & rightOne) != 0) {
                onlyOne ^= arr[i];
            }
        }

        System.out.println(onlyOne+","+(onlyOne ^ eor));
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8, 8};

        PrintOddTimesNum2(arr);
    }

}
