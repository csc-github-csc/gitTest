package interfacePackage;

/**
 * 接口中的抽象方法：
 *  pubic default 返回值类型 方法名（参数列表）{
 *      方法体
 *  }
 *
 *
 */
public interface Demo2InterfaceDefault {

    public abstract void methodAbs1();

    public default void methodDefault1(){
        System.out.println("接口中的默认方法是为了解决接口升级的问题！");
    }

    default void methodDefault2(){};

    //接口当中的默认方法：必须有方法体{}，方法体内容可以没有（但没有方法体内容定义这个默认方法意义何在呢？
    // ）public关键字可以选择省略，但是default一定不能省略
}
