package thread;

public class JoinThreadTest {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread());
            } 
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        //t1开始
        t1.start();

        try {
            //t1插队，此时主线程会挂起，直到t1死去才继续运行
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //主线程被t1插队，所以t1执行完之后，执行主线程,在t1结束前t2不会启动
        t2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread());
        }
    }
}
