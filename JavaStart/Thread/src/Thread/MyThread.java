package Thread;

public class MyThread extends Thread{
    /*1.继承Thread（创建一个Thread的子类）*/

    /*2.重写Thread中的run方法
    * 目的：设置线程的任务，简单点说就是要做什么，在这run()里面写
    * */
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("run"+"---->"+i);
        }
    }
}
