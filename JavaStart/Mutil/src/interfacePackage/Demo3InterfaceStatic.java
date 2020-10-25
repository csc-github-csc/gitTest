package interfacePackage;

/**
 * 静态方法
 * public static (两个固定关键字) 返回值类型 方法名（参数列表）{方法体}
 *
 * 和默认方法一样，也必须有方法体。
 *但是接口中的默认方法可以被实现类继承，静态方法不行！！切记！！
 *
 */
public interface Demo3InterfaceStatic {
    public static void methodStatic(){
        System.out.println("从java8开始，允许接口中定义静态方法。");
    }
}
