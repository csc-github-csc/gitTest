package Thread;
//2.
public class RunnablePool implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行新线程");
    }
}
