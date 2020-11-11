package Thread;

/**
 * 当前线程：main线程
 * 新线程：Thread-0，Thread-1，Thread-2...
 *
 */

public class Demo2 {
    public static void main(String[] args) {
        /*3.创建Thread的子类对象*/
        //MyThread2 myThread2 = new MyThread2();
        /*4.调用start()方法*/
        //myThread2.start();//Thread-0
        //new MyThread2().start();//Thread-1

        MyThread2 myThread2 = new MyThread2();
        myThread2.start();//Thread-0
    }
}
