package Collection;

import java.util.ArrayList;
import java.util.Iterator;

/*泛型*/
public class Demo3Ee {
    public static void main(String[] args) {
        /*
        创建集合对象，不使用泛型
        好处：
            集合不使用泛型，默认的类型就是Object
        弊端：
            不安全，会引发异常
         */
        ArrayList list  =  new ArrayList();
        list.add(1);
        list.add("aa");//存储不同数据类型不报错
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
            String str = (String)obj;
            System.out.println(str.length());//出现ClassCastException类型转型异常
        }


        /*
            使用泛型：
            好处：
             1.避免呢了类型转换的麻烦。存储的是什么类型，取出的就是什么类型。
             2.把运行期异常，（代码运行之后会抛出的异常），提升到了编译期（写代码的时候就会报错）

         */
        ArrayList<String> array  =  new ArrayList();
        array.add("aa");
        //array.add(1); 编译的时候就会报错，，因为泛型是String类型，所以不能存Integer类型


    }
}
