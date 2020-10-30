package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Demo1HashSet {
    public static void main(String[] args) {
        /**
         * set集合：无序，没有索引，不允许存储重复数据
         */
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);hashSet.add(2);hashSet.add(3);hashSet.add(1);
        /*没有索引不能用普通for循环遍历，所以应该用foreach或者迭代器*/
        for(Integer integer : hashSet){
            System.out.println(integer);    //1 2 3
        }
        /*迭代器*/
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());  //1 2 3
    }
}
