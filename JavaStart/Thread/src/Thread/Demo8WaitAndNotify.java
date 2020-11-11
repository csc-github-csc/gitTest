package Thread;

public class Demo8WaitAndNotify {
    /**
     *等待唤醒案例： 创建一个顾客线程，wait();创建一个老板线程，notify().
     * 注意事项：
     *  1.顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个正在执行
     *  2.同步使用的锁对象必须保证唯一
     *  3.只有锁对象才能使用wait和notify方法
     *
     */
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();
        //设置一个顾客线程
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                synchronized (obj){
                    System.out.println("告知老板我要包子");
                    //调用wait方法，放弃CPU的执行，进入到WAIT状态（无限等待）
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("开吃");
                }
            }
        }.start();

        //创建一个老板线程
        new Thread(){
            @Override
            public void run() {
                //花了5秒做包子
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //包子等待和唤醒的线程只能有一个执行，需要使用同步技术
                synchronized (obj){
                    System.out.println("老板5秒钟做好包子，唤醒顾客吃包子");
                    //包子做好后，调用notify方法，唤醒顾客吃包子
                    obj.notify();
                }
            }
        }.start();



    }


 }