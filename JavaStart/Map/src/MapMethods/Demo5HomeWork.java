package MapMethods;

import java.util.HashMap;
import java.util.Map;

/*

Map集合练习：
    计算一个字符串中每个字符出现次数。
 */
public class Demo5HomeWork {
    public static void main(String[] args) {
        String str = "abosadscccacfffvf";
        Map<Character,Integer> map = new HashMap<>();
        //str中的每个字符作为Character存入到map中，Integer值默认为1
        //如果有字符重复了，Integer的值就+1


        char[] chars = str.toCharArray();
        for (int i = 0; i <chars.length ; i++) {

            if(map.containsKey(chars[i])){
                map.put(chars[i],map.get(chars[i])+1);
            }else {
                map.put(chars[i],1);
            }
        }
        System.out.println(map);

    }
}
