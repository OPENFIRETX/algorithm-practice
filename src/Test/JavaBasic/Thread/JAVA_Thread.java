package Test.JavaBasic.Thread;

public class JAVA_Thread {
    public static void main(String[] args) {
        // TODO 线程
        System.out.println(Thread.currentThread().getName());


        // TODO 创建线程
//        Thread t = new Thread();
        MyThread t = new MyThread();

        // TODO 启动
        t.start();
    }
}

//TODO自定义线程类
class MyThread extends Thread {

    @Override
    public void run() {
//        super.run();
        System.out.println("my：：：" + Thread.currentThread().getName());
    }
}
