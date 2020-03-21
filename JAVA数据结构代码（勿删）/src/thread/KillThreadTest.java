package thread;

public class KillThreadTest {
    public static void main(String[] args) {
        KillThreadRunner killThreadRunner = new KillThreadRunner();
        Thread thread = new Thread(killThreadRunner);
        thread.start();

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程改变子线程flag...");
//        killThreadRunner.setFlag(true);
        thread.interrupt();
    }
}

class KillThreadRunner implements Runnable{
private boolean flag = false;
    @Override
    public synchronized void run() {
        while (!flag){
            System.out.println("子线程运行");
            try {
                wait();
            } catch (InterruptedException e) {
                flag = true;
                e.printStackTrace();
            }
        }
        System.out.println("子线程结束...");
    }

    public boolean isFlag(){
        return flag;
    }

    public void setFlag(boolean flag){
        this.flag = flag;
    }
}