package Thread;

public class Demo6 {
    /*匿名内部类实现多线程的创建*/
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <5 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }
            }
        });
        thread.start();

        Thread t = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <5 ; i++) {
                    System.out.println(getName()+"--黑马-->"+i);
                }
            }
        };
        t.start();







    }
}
