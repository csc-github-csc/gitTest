package Thread;
/*多线程安全问题
* 模拟卖票问题
* */
public class Demo7 {
    public static void main(String[] args) {
       // Runnable1 runnableImpl1 = new Runnable1();
       // Runnable2 runnableImpl1 = new Runnable2();
       // Runnable3 runnableImpl1 = new Runnable3();
       Runnable4 runnableImpl1 = new Runnable4();
        Thread t1 = new Thread(runnableImpl1);
        Thread t2 = new Thread(runnableImpl1);
        Thread t3 = new Thread(runnableImpl1);
        /*同一个实现类，三个线程，即大家共有100票*/
        t1.start();
        t2.start();
        t3.start();
    }
}
