package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();//多态写法
        System.out.println(coll);//输出的是：[] 而不是地址值，说明重写了toString（）方法
        /*add(E e)*/
        System.out.println(coll.add("one"));//true  add()返回值是boolean类型
        System.out.println(coll);//[one]
        coll.add("two");
        coll.add("three");
        coll.add("four");
        System.out.println(coll);//[one,two,three,four]
        /*remove(E e)*/
        System.out.println(coll.remove("four"));//true;删除的元素存在，删除并返回true
        System.out.println(coll);//[one,two,three]
        System.out.println(coll.remove("111"));//false;删除的元素不存在，返回false
        System.out.println(coll);//[one,two,three]
        /*contaion(E e)*/
        System.out.println(coll.contains("one"));//true,集合里面有one
        System.out.println(coll.contains("four"));//false,集合里面没有four
        /*isEmpty()*/
        System.out.println(coll.isEmpty());//false,集合不为空
        /*int size()*/
        System.out.println(coll.size());//3,集合中元素个数为3
        /*Object[] toArray():把集合变成数组*/
        Object[] objects = coll.toArray();
        for (int i = 0; i <objects.length ; i++) {
            System.out.println(objects[i]);//one , two ,three
        }
        /*void clear():删除集合中的元素，但是集合还在*/
        coll.clear();
        System.out.println(coll.isEmpty());//true,集合元素被清空，但要注意集合还在
    }
}
