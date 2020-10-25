package staticPackage;

/**
 * 1.静态和对象无关，不能用this
 *
 * 2.在内容中静态内容优先于非静态内容先加载，所以非静态内容可以访问静态内容而
 * 静态内容无法访问非静态内容。。。
 *
 */
public class Demo2 {

    int num;
    static int numStatic;

    public static void methodStatic1(){
        System.out.println("这是个静态方法1");
    }

    void method(){
        System.out.println("普通方法");
        methodStatic1();//成员方法可以直接调用静态方法
    }

    public static void methodStatic2(){
        System.out.println("这是个静态方法2");
        methodStatic1();//在本类中可以直接调用本类的静态方法。

        //System.out.println(num);错误，静态内容不能访问非静态内容
        System.out.println(numStatic);
        //System.out.println(this);错误，静态内容不能出现this


    }


}
