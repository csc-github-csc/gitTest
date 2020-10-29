package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo2Iterator {
    public static void main(String[] args) {
        /*Iterator接口的用法*/
        Collection<String> coll = new ArrayList<>();
        coll.add("one");
        coll.add("two");
        coll.add("three");
        coll.add("four");
        /*使用Collection接口中的方法来创建迭代器对象，用Iterator接收*/
        /*注意：
        * Iterator<E>接口中的泛型，跟集合中的泛型是一样的。
        * */
        //多态   接口                    实现类对象
        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /*foreach循环用于集合和数组*/
        /*集合*/
        for (String list: coll) {
            System.out.println(list);//one two three four
        }

        /*数组*/
        int[] nums = {1,2,3,4,5};
        for(int num : nums){
            System.out.println(num);
        }


        ArrayList<String> arry = new ArrayList<>();
        arry.add("A");
        arry.add("B");
        arry.add("C");
        Iterator<String> iterator1 = arry.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());//迭代器是集合通用的获取元素的方式
        }
        for (int i = 0; i <arry.size() ; i++) {
            System.out.println(arry.get(i));//ArrayList集合用自身的索引的方式获取元素
        }

    }
}
