package Thread;

public class Lambda1 {
    public static void main(String[] args) {
        //匿名内部类，匿名对象实现多线程
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"正在执行新线程");
            }
        }).start();
        //Lambda表达式
        new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"正在执行新线程");
         }
        ).start();


    }
}
