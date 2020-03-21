package thread;

public class TicketSellTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        t1.setName("江北售票点：");
        t2.setName("江南售票点：");
        t1.start();
        t2.start();
    }
}

class Ticket implements Runnable{
    private Integer ticketNo = 0;

    @Override
    public void run() {
        while (ticketNo<100){
            try {
                Thread.sleep(100);
                sell();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void sell(){
        int max = 100;
        synchronized (this) {
            if (ticketNo < max) {
                System.out.println(Thread.currentThread().getName() + "卖了第" + (++ticketNo) + "张票");
            }
        }
    }
}
