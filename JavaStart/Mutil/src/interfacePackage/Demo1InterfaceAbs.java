package interfacePackage;

public interface Demo1InterfaceAbs {
    /**
     * 任何版本的接口中都可以定义抽象方法
     * 格式：
     * public abstract 返回值类型 方法名（参数列表）;
     */

    public abstract  void method1();

    public void method2();

    abstract void method3();

    void method4();
    /*public abstract是固定关键字，可以选择性省略 */

    String method5();

    int method6(int num);
    /*方法的三要素可以随意定义*/




}
