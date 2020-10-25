package innerPackage;

/**
 * 如果接口的实现类（或者是父类的子类）只需要使用唯一的一次，那么就可以省略
 * 该类（指的是实现类或子类）的定义。而改用【匿名内部类】
 *
 *
 *
 */
public class Demo4 {

    public static void main(String[] args) {
        //Demo4Interface demo = new Demo4InterfaceImplement();//多态写法
        //demo.method();



        //匿名内部类的写法

        Demo4Interface  demo1 = new Demo4Interface() {
            @Override
            public void method() {
                System.out.println("匿名内部类重写了方法");
            }
        };
        demo1.method();


        //匿名内部类，也是匿名对象
        new Demo4Interface() {
            @Override
            public void method() {
                System.out.println("匿名内部类重写了方法");
            }
        }.method();

    }
}
