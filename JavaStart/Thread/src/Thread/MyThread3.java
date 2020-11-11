package Thread;

public class MyThread3 extends Thread{
     public MyThread3(){

     }
     public MyThread3(String name){
         super(name);
     }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
