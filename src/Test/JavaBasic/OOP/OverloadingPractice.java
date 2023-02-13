package Test.JavaBasic.OOP;

public class OverloadingPractice {

    public static void main(String[] args) {
        AAA aaa = new AAA();
        test(aaa);

        AAA outer = new AAA();
        AAA.innnerA innerA = outer.new innnerA();
    }

    static void test(AAA aaa) {
        System.out.println("AAA");
    }

    static void test(BBB bbb) {
        System.out.println("BBB");
    }
}


class AAA {

    public class innnerA {

    }

}

class BBB extends AAA {

}