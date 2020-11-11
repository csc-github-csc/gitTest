package Thread;
/*1、创建Runnable接口的实现类*/
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
     /*2、重写run()方法，即设置线程任务*/
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
