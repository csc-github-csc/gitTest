package Thread;

public class Demo5 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
        /*3、创建Runnable接口的实现类对象*/
        RunnableImpl runnable = new RunnableImpl();
        /*4、创建Thread类对象，构造方法中传递Runnable接口的实现类对象*/
        Thread thread = new Thread(runnable);
        /*5、调用Thread类中的start方法，开启新的线程执行run方法。*/
        thread.start();
    }
}
