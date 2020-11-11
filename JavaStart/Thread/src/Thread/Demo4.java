package Thread;

public class Demo4 {
    public static void main(String[] args) {
        /*sleep()*/
        /*模拟一个秒表*/
        for (int i = 1; i <=60 ; i++) {
            System.out.println(i);
            /*调用线程的sleep()方法，让线程暂停1000毫秒*/
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
