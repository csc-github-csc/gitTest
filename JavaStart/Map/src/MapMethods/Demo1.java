package MapMethods;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        /*public V put(K key,V value)*/
        /*创建Map集合对象，多态*/
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("李晨", "范冰冰1");
        System.out.println(v1);//null  map集合中无重复的key,返回值V是null
        String v2 = map.put("李晨", "范冰冰2");
        System.out.println(v2);//范冰冰1  map集合中有重复的key，原来的value值会被替换，
                                // 返回值是被替代的value值



        Map<String,Integer> map1 = new HashMap<>();
        map1.put("赵丽颖",165);
        map1.put("Angelababy",168);
        System.out.println(map1);//{赵丽颖=165, Angelababy=168} 重写toSting方法
        Integer integer1 = map1.remove("赵丽颖");//165 存在key,返回被删除的key的value值
        Integer integer2 = map1.remove("小三");//null，不存在key,返回null

        System.out.println(map1.get("赵丽颖"));//null 之前该key被删除了,所以返回null
        System.out.println(map1.get("Angelababy"));//168 存在key，返回该key的value值

        System.out.println(map1.containsKey("赵丽颖"));//false
        System.out.println(map1.containsKey("Angelababy"));//true


    }
}
