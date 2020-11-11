package Thread;

public class Demo3 {
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        myThread3.setName("小七");
        myThread3.start();//小七

        new MyThread3("小八").start();//小八
    }
}
