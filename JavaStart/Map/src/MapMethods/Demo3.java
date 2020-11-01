package MapMethods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        /*遍历map集合的第二种方式
        * 使用Entry对象  Set<Map.Entry<K,V>> entrySet();
        * */
        Map<String,Integer> map = new HashMap<>();
        map.put("a",165);map.put("b",166);map.put("c",167);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        /*迭代器循环*/
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> nextEntry = iterator.next();
            System.out.println("Entry对象："+nextEntry);//该种方式直接拿到键和值
            System.out.println("Enrty对象的值："+nextEntry.getKey()+":"+nextEntry.getValue());
        }
        /*foreach*/
        for(Map.Entry<String, Integer> entry : entrySet){
            System.out.println("Entry对象："+entry);//该种方式直接拿到键和值
            System.out.println("Entry对象的值："+entry.getKey()+":"+entry.getValue());
        }

    }
}
