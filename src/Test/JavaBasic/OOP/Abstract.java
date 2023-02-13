package Test.JavaBasic.OOP;

public class Abstract {

    public static void main(String[] args) {

        Chinese c1= new Chinese();
        c1.eat();

    }

}

abstract class Person {

    public abstract void eat();

}

class Chinese extends Person {

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}

