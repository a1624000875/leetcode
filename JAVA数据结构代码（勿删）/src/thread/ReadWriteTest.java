package thread;

public class ReadWriteTest {
    public static void main(String[] args) {
        Res res = new Res();
        ReadThread readThread = new ReadThread(res);
        WriteThread writeThread = new WriteThread(res);
        new Thread(readThread).start();
        new Thread(writeThread).start();
    }
}

class WriteThread implements Runnable{
    private Res res;
    WriteThread(Res res){
        this.res = res;
    }
    @Override
    public void run() {
        while (true){
            try {
                synchronized (res){
                    Thread.sleep(250);
                    res.setName("张三");
                    res.setSex("男");
                    System.out.println(res.getName()+":"+res.getSex());
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ReadThread implements Runnable{
    private Res res;
    ReadThread(Res res){
        this.res = res;
    }
    @Override
    public void run() {
        while (true){
            try {
                synchronized (res) {
                    Thread.sleep(250);
                    res.setName("zhangSan");
                    res.setSex("male");
                    System.out.println(res.getName() + ":" + res.getSex());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//class Res{
//    private String name;
//    private String sex;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//}