package thread;

public class Test extends Thread{
    public static void main(String[] args) {
        Test test = new Test();
        test.start();
        try {
            test.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        test.stop();
        test.start();
        test.run();
        try {
            test.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        test.doIt();

    }

    public void run(){
        System.out.println("Run");
    }
    public void doIt(){
        System.out.println("doIt");
    }
}
