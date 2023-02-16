package Test.JavaBasic.Thread;

public class JAVA_Thread02 {
    public static void main(String[] args) throws Exception {

        //并发执行 多个线程独立
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

        //串行
        t2.join();
        t1.join();
        System.out.println("main执行完");
    }
}

//TODO自定义线程类
class MyThread1 extends Thread {

    @Override
    public void run() {
//        super.run();
        System.out.println("my111：：：" + Thread.currentThread().getName());
    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
//        super.run();
        System.out.println("my222：：：" + Thread.currentThread().getName());
    }
}