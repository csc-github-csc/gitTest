package MapMethods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        /*遍历集合的方式一
        * Set<K> keySet();
        * */
        Map<String,Integer> map = new HashMap<>();
        map.put("a",165);map.put("b",166);map.put("c",167);
        Set<String> keySet = map.keySet();
        /*迭代器*/
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("key:"+next);
            System.out.println("value:"+map.get(next));//用get(key)返回相应的value
        }
        /*foreach*/
        for (String key: keySet) {
            System.out.println("key:"+key);
            System.out.println("value:"+map.get(key));
        }


    }
}
