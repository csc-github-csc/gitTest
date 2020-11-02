package exception;


import java.util.HashMap;
import java.util.Scanner;

/*
模拟注册操作，如果用户名存在，则抛出异常并提示：亲，该用户名已经被注册。
 */
public class Demo7HomeWork {
    public static void main(String[] args) throws RegisterException {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("qq",1);
        map.put("qqq",1);
        map.put("ww",1);
        System.out.println("请输入用户名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if(map.containsKey(name))
            throw new RegisterException("亲，该用户名已经被注册了！");

            /*try{
                map.containsKey(name);
            }catch (Exception e){
                throw new RegisterException("亲，该用户名已经被注册了！");
                return;
            }*/

            map.put(name,1);
            System.out.println(map);
            System.out.println("你的用户名是："+name);

            /*
            声明异常的话（throws）将异常交给JVM,而
            JVM都是采取中断程序，所以有异常产生的话，21行以后的
            代码就不会执行了

            捕获异常（try catch），自己处理，当catch捕获异常并
            抛出异常后，程序还会向下执行，这时候就需要有个return来中断
            程序运行了。


             */

        /*
        以上都是编译期异常，而如果是运行期异常的话，我们就不需要
        声明或者捕获异常，一切都可以交给JVM来做。
         */

    }


}
