package Test.JavaBasic.OOP.Interface;

public class Test {

    public static void main(String[] args) {
        Frog f = new Frog("小请",1);
        System.out.println(f.getName()+","+f.getAge());

        f.eat();
        f.swim();
    }

}
