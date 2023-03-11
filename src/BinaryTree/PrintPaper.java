package BinaryTree;

public class PrintPaper {

    //n 折几次
    public static void printAll(int n) {
        process(1, n, true);
    }

    public static void process(int nowLevel, int n, boolean isAo) {
        if (n < nowLevel) {
            return;
        }
        process(nowLevel + 1, n, isAo);
        System.out.println(isAo ? "凹" : "凸");
        process(nowLevel + 1, n, !isAo);
    }

    public static void main(String[] args) {
        printAll(3);
    }
}
