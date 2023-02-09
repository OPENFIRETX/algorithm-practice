package Test.JavaBasic.OOP.Interface;

public class Frog extends Animal implements Swim{

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃 虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在 蛙泳");
    }
}
