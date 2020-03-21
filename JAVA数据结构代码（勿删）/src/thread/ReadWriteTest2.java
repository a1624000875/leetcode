package thread;

public class ReadWriteTest2 {
    public static void main(String[] args) {
        // 共享资源，写在这里是为了让两个线程共享同一个res
        Res res = new Res();
        // 在创建Input线程类的时候将共享资源传入
        WriteRes write = new WriteRes(res);

        // 在创建Output线程类的时候将共享资源传入
        ReadRes read = new ReadRes(res);

        new Thread(write).start();
        new Thread(read).start();
    }
}

class WriteRes implements Runnable {
    private Res res;
    private boolean flag = false;

    public WriteRes(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (res) {

                //当前有数据
                if (res.isHasRes()) {
                    //写的线程等待
                    try {
                        res.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    if (flag) {
                        res.setName("zhaoSi");
                        res.setSex("male");
                    } else {
                        res.setName("赵四");
                        res.setSex("男");
                    }
                    flag = !flag;

                    res.setHasRes(true);
                    res.notify();
                }
            }
        }
    }

}

class ReadRes implements Runnable {
    private Res res;

    public ReadRes(Res res) {
        this.res = res;
    }

    @Override
    public void run() {
        while (true){
            synchronized (res){

                if (res.isHasRes()){
                    System.out.println(res.getName() + "----" + res.getSex());

                    res.setHasRes(false);

                    res.notify();
                }else {
                    try {
                        res.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

}

class Res {
    private boolean hasRes = false;

    public boolean isHasRes() {
        return hasRes;
    }

    public void setHasRes(boolean hasRes) {
        this.hasRes = hasRes;
    }

    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}