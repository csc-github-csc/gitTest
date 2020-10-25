package interfacePackage;
/*
* 接口不能直接使用，必须得有实现类
* 实现类必须实现（即覆盖重写接口中的所有的抽象方法）
*
* */
public class Demo1InterfaceAbsImpl implements Demo1InterfaceAbs{
    @Override
    public void method1() {
        System.out.println("这是第1个抽象方法！");
    }

    @Override
    public void method2() {
        System.out.println("这是第2个抽象方法！");
    }

    @Override
    public void method3() {
        System.out.println("这是第3个抽象方法！");
    }

    @Override
    public void method4() {
        System.out.println("这是第4个抽象方法！");
    }

    @Override
    public String method5() {
        System.out.println("这是第5个抽象方法！");
        return null;
    }

    @Override
    public int method6(int num) {
        System.out.println("这是第6个抽象方法！");
        return 0;
    }
}
