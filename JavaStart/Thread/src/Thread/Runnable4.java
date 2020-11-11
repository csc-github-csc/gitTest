package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runnable4 implements Runnable{/*解决线程安全问题:使用Lock锁*/
    private int ticket = 100;

    Lock rl = new ReentrantLock();//1.创建Lock接口的实现类ReentrantLock的对象
    @Override
    public void run() {
        //2.在可能出现线程安全问题的代码前加锁
        rl.lock();
        while (ticket>0){
            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"票");
            ticket--;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {  //无论是否有异常，都释放锁  3.在...代码后解锁
                rl.unlock();
            }
        }
    }
}
