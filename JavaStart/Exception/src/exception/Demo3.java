package exception;

import java.util.Objects;

public class Demo3 {
    public static void main(String[] args) {
            method(null);
    }

    public static void method(Object obj){
        /*判断传递的参数是否为空*/
        /*if(obj==null){
            throw new NullPointerException("传递的参数是null");
        }*/

        //Objects.requireNonNull(obj);//参数为空，抛出异常NullPointerException
        Objects.requireNonNull(obj,"传递的参数是null");//参数为空，抛出异常NullPointerException并在控制台打印输出"传递的参数是null"
    }
}
