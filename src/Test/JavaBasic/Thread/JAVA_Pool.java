package Test.JavaBasic.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JAVA_Pool {
    public static void main(String[] args) throws Exception {

        //固定数量
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //动态数量
        ExecutorService executorService1 = Executors.newCachedThreadPool();

        //单一线程
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();

        //定时调度线程
        ExecutorService executorService4 = Executors.newScheduledThreadPool(3);

        for (int i = 0; i < 5; i++) {
            executorService2.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }


    }
}
