package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args) {

        try {
            readFile("c:\\a.tx");//catch捕获到了异常情况：文件的后缀名不对劲！    后续代码
        } catch (Exception e) {
           //e.printStackTrace();、、默认调用此方法
            //System.out.println("catch捕获到了异常情况：文件的后缀名不对劲！");
            //System.out.println(e.getMessage());//文件的后缀名不对劲！
            //System.out.println(e.toString());//重写Object类的toString方法java.io.IOException: 文件的后缀名不对劲！
            e.printStackTrace();//默认调用的就是此方法
            /*
            java.io.IOException: 文件的后缀名不对劲！
	at exception.Demo5.readFile(Demo5.java:27)
	at exception.Demo5.main(Demo5.java:10)
             */

        }
        System.out.println("后续代码");

    }

    public static void readFile(String fileName) throws Exception {

        /*如果文件的后缀不是.txt结尾，也抛出异常*/
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对劲！");
        }
        System.out.println("文件没有问题");
    }
}
