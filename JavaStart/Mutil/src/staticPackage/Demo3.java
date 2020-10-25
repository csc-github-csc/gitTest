package staticPackage;

public class Demo3 {

    static{
        System.out.println("静态代码块");
    }


    public Demo3(){
        System.out.println("构造函数");
    }


    {
        System.out.println("普通代码块又叫做构造代码块");
    }

    //执行顺序 静态代码块 》 构造代码块 》 构造方法

}
