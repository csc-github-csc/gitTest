package Thread;

public class Demo1{
    public static void main(String[] args) {
        /*3.创建Thread的子类对象*/
        MyThread myThread = new MyThread();
        /*4.调用Thread类中的start（）方法,开启新的线程，执行run（）方法*/
        myThread.start();

        for (int i = 0; i <20 ; i++) {
            System.out.println("main"+"-->"+i);
        }//java程序属于抢占式调度，优先级高的先执行，同一优先级则随机执行。
        //所以程序每次执行得到的结果都不一样。
    }
}
