package Test.JavaBasic.OOP;

public class OverloadingPractice {

    public static void main(String[] args) {
        AAA aaa = new AAA();
        test(aaa);
    }

    static void test(AAA aaa) {
        System.out.println("AAA");
    }
    static void test(BBB bbb) {
        System.out.println("BBB");
    }
}



class AAA {

}

class BBB extends AAA {

}