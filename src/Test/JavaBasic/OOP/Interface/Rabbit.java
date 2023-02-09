package Test.JavaBasic.OOP.Interface;

public class Rabbit extends Animal {

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃萝卜");
    }
}
