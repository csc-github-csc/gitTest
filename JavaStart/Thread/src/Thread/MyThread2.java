package Thread;
/*创建Thread类的子类*/
public class MyThread2 extends Thread {
    /*重写run（）方法，设置线程任务*/

    @Override
    public void run() {
        //System.out.println(getName());/*1.获取当前线程名字*/

        /*链式编程： 2.先获取当前线程，在获取当前线程的名字*/
        System.out.println(currentThread().getName());
    }
}
