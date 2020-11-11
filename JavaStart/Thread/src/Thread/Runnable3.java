package Thread;

public class Runnable3 implements Runnable{/*解决线程安全问题:使用同步方法*/
    private int ticket = 100;

    @Override
    public void run() {
          sellTicket();
    }
    public synchronized void sellTicket(){//把可能出现线程问题的代码放入一个用synchronized修饰的方法中
        while (ticket>0){
            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"票");
            ticket--;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
