package packPackage;

import jdk.nashorn.internal.ir.CallNode;

public class Demo1 {
    public static void main(String[] args) {
        /*装箱的四种方法，两种构造，两种静态*/
        /**/
        Integer integer1 = new Integer(123);
        System.out.println(integer1);//123
        Integer integer2 = new Integer("123");
        System.out.println(integer2);//123
        /**/
        System.out.println(Integer.valueOf(123));//123
        System.out.println(Integer.valueOf("123"));//123
        //Integer integer = new Integer("a");错误写法，只能是基本数据类型的字符串

        /*拆箱 int intValue();*/
        Integer integer = new Integer(222);
        int i = integer.intValue();
        System.out.println(i);//222
    }
}
