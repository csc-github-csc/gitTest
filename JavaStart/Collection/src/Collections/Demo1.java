package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        /*集合工具类，Collections*/
        Collection<String> coll = new ArrayList<>();
        /*往集合中添加多个元素：static void addAll(Collection<E> c,T...t)*/
        Collections.addAll(coll,"a","b","c","www");
        System.out.println(coll);//[a, b, c, www]
        /*打乱集合中元素顺序：*/
        Collections.shuffle((List<String>) coll);
        System.out.println(coll);//[www, b, c, a]每次输出都不一样
    }
}
