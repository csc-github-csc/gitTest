package Thread;

import jdk.nashorn.internal.ir.CallNode;

public class Runnable2 implements Runnable{/*解决线程安全问题:使用同步代码块*/
    private int ticket = 100;

    Object obj = new Object();//这是锁对象
    @Override
    public void run() {
        synchronized (obj){  //把可能出现线程安全问题的代码放入同步代码块中
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
}
