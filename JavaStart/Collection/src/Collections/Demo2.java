package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(199);list.add(2);
        System.out.println(list);//[1, 199, 2]
        Collections.sort(list);//这里用字符串好像也可以进行升序排序
        System.out.println(list);//[1, 2,199]
    }
}
