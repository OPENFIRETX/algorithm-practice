package Test.JavaBasic.OOP;

public class OOPExtends {
    class Parent {
        String name = "张三";

        public Parent(String name) {
            this.name = name;
        }
    }
    class Child extends Parent {
        public Child() {
            super("李四");
        }
    }
    //    多态
    static class Person {
        void testPerson() {
            System.out.println("test person");
        }
    }
    static class Boy extends Person {
        void testBoy() {
            System.out.println("test boy");
        }
    }
    //    public static void main(String[] args) {
    //
    //        Person p1 = new Person();
//        Person p2 = new Boy();
//
//        p2.testPerson();
//    }
    //重载
    public static void main(String[] args) {

    }




}
