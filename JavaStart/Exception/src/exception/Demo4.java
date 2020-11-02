package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws Exception {
        /*
        定义一个方法，对传递的文件路径进行判断
        如果路径不是“c:\\a.txt”,那么我们就抛出文件找不到异常，告知方法的调用者
         */
        //method signature：方法签名，方法声明
        /*
        注意：FileNotFoundException不是运行异常，是编译异常，就必须处理
                要么throws，要么try...catch
         */
        readFile("c:\\a.txt");
        //readFile("d:\\a.txt");//FileNotFoundException,"传递的文件路径不是c:\\\\a.txt"
        //readFile("c:\\a.bat");//FileNotFoundException,"传递的文件路径不是c:\\\\a.txt"

    }
    /*FileNotFoundException extends IOException extends Exception*/
   // public static void readFile(String fileName) throws FileNotFoundException,IOException {
   // public static void readFile(String fileName) throws IOException {
    public static void readFile(String fileName) throws Exception {
        /*如果文件路径不对，则抛出异常*/
        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是c:\\\\a.txt");
        }
        /*如果文件的后缀不是.txt结尾，也抛出异常*/               //这两个异常不能同时产生，因为第一个异常就包含了第二个异常产生的原因，所有
                                                          //第一个异常产生后就不会继续执行下去了。
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对劲！");
        }
        System.out.println("文件没有问题");
    }
}
