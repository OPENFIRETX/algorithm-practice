package Test.JavaBasic.Thread;

public class JAVA_Thread03 {
    public static void main(String[] args) throws Exception {


        Thread t6 = new Thread(() -> {
            System.out.println("666666666666!!!");
        });

        t6.start();

        Thread t8 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(88888);
            }
        });
        t8.start();

        System.out.println("main!!!");
    }
}

