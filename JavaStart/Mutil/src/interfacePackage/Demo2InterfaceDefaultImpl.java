package interfacePackage;

public class Demo2InterfaceDefaultImpl implements Demo2InterfaceDefault {
    @Override
    public void methodAbs1() {
        System.out.println("实现了接口中定义的（抽象）方法");
    }

    @Override
    public void methodDefault2() {
        System.out.println("接口实现类覆盖重写接口的默认方法。");
    }
}
