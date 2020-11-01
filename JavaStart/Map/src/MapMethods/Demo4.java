package MapMethods;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo4 {
    public static void main(String[] args) {
        /*之前学的任何集合都可以存储null作为键和值*/
        HashMap<String,String> map = new HashMap<>();
        map.put(null,null);map.put("a",null);
        map.put(null,"a");map.put("b","b");
        System.out.println(map);//{null=a, a=null, b=b}
        /*Hashtable不允许存储null值和null键*/
        Hashtable<String,String> table = new Hashtable<>();
        //table.put(null,null);//NullPointerException
        //table.put("a",null);//NullPointerException
        //table.put(null,"a");//NullPointerException
        table.put("b","c");
        System.out.println(table);//{b=c}

    }
}
