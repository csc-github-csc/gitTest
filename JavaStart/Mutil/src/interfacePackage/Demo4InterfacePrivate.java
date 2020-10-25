package interfacePackage;

public interface Demo4InterfacePrivate {

    public default void method1(){
        System.out.println("接口中的默认方法1");
        //methodCommonn();
    }

    public default void method2(){
        System.out.println("接口中的默认方法2");
        //methodCommonn();
    }

    public static void method3(){
        System.out.println("接口中的静态方法1");
        //methodCommonStatic();
    }

    public static void method4(){
        System.out.println("接口中的静态方法2");
        //methodCommonStatic();
    }

/*      这是普通私有方法，解决多个默认方法重复代码问题
    private void methodCommonn(){  只有Java 9以上的版本才允许接口中定义私有方法。
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }*/

    /*这是静态私有方法，解决多个静态方法重复代码问题。 同样Java 9中才可以定义
    private static void methodCommonStatic(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
*/
}
