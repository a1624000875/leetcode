package thread;

public class DaemonThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
          while (true){
              System.out.println(Thread.currentThread());
          }
        });

        t1.setDaemon(true);
        t1.start();
        for (int i = 0; i <500; i++) {
            System.out.println(Thread.currentThread()+":"+i);
        }
    }
}
