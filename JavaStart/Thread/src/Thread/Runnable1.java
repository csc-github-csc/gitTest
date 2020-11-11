package Thread;

public class Runnable1 implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (ticket>0){
            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"票");
            ticket--;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
