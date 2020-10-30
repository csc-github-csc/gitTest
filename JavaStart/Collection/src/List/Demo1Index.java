package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
List接口中带索引的方法
 */
public class Demo1Index {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//多态
        list.add("a"); list.add("b"); list.add("c"); list.add("a");
        System.out.println(list);//[a, b, c, a] 打印的不是地址，说明重写了toString方法

        /*指定位置添加元素：public void add(int index,E element)*/
        list.add(2,"ithehima");
        System.out.println(list);//[a, b, ithehima, c, a]

        /*移除元素：public E remove（int index，E element）*/
        System.out.println(list.remove(2));//itheima 该方法返回值是移除的元素

        /*替换元素：public E set(int index,E element)*/
        System.out.println(list.set(2,"itcast"));//返回的是被替换之前的元素
        System.out.println(list);//[a,b,itcast,a]

        /*List结合遍历的三种方式*/
        //普通for循环
        for (int i = 0; i <list.size() ; i++) {
            /*获取指定位置的元素：public E get(int index)*/
            System.out.println(list.get(i));//a b itcast a
        }
        //增强for循环（该循环可以遍历集合和数组，底层实现原理是迭代器Iterator）
        for (String str: list) {
            System.out.println(str);//a b itcast a
        }
        //迭代器
        Iterator<String> iterator = list.iterator();//多态
        while (iterator.hasNext()){
            System.out.println(iterator.next());//a b itcast a
        }
        //list.get(6);IndexOutOfBoundsException 索引越界异常
    }
}
