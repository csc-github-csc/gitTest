package interfacePackage;

public class Demo1 {

    public static void main(String[] args) {

        //Demo1InterfaceAbs demo1 = new Demo1InterfaceAbs();错误写法，接口是抽象的

        //多态的写法
        Demo1InterfaceAbs demo1 = new Demo1InterfaceAbsImpl();
        demo1.method6(10);
        String s = demo1.method5();

    }
}
