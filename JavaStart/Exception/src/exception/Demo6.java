package exception;

import java.io.IOException;
import java.util.Objects;

public class Demo6 {
    public static void main(String[] args) {
        /*finally：无论是否有异常，都会执行；
        *           不能单独使用，必须和try一起使用
        *           一般用于资源释放，资源回收
        *
        * */
        try {
            readFile("d:\\a.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");
        }

        try {
            method(null);
        }finally {
            System.out.println("可以没有catch，在运行异常的情况下");
        }
    }
    public static void readFile(String fileName) throws IOException {
            if(!fileName.equals("c:\\\\a.txt")){
               throw new IOException("文件路径不对");
            }
    }

    public static void method(String msg){
        if(msg==null){
            throw new NullPointerException("嘻嘻嘻嘻嘻");
        }
    }
}
