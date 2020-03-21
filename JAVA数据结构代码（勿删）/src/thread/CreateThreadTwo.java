package thread;

public class CreateThreadTwo {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            ThreadTool.createThread();
        }
    }
}

class ThreadTool{
    static void createThread(){
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.currentThread());
                }
        }).start();
    }
}
