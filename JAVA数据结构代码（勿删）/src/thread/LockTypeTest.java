package thread;

public class LockTypeTest {
    public static void main(String[] args) {
        LockTypeRunnable r = new LockTypeRunnable();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}

class LockTypeRunnable implements Runnable {
    private Integer tickets = 0;

    @Override
    public void run() {
        String t1 = "t1";
        while(true){
            try {
                Thread.sleep(100);
                if (Thread.currentThread().getName().equals(t1)){
                    //同步方法
                    sell();
                }else{
                    synchronized (this){
                        int max = 100;
                        if (tickets < max) {
                            System.out.println(Thread.currentThread().getName() + "卖了第" + (++tickets) + "张票");
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    private synchronized void sell(){
        int max = 100;
        if (tickets<max){
            System.out.println(Thread.currentThread().getName()+"卖了第"+(++tickets)+"张票");
        }
    }
}

