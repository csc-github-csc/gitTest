package interfacePackage;

public class Demo3 {

    public static void main(String[] args) {
        Demo3InterfaceStaticImpl demo = new Demo3InterfaceStaticImpl();
        //demo.methodStatic();
        //上面的是错误写法，静态和对象无关，，，实现类不能继承接口中的静态方法。
        //正确做法是：接口名.静态方法名（参数列表）;
        Demo3InterfaceStatic.methodStatic();
    }
}
