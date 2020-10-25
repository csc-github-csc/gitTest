package innerPackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * java.util.list正是ArrayLisy所实现的接口
 */
public class Demo7Interface {

    public static void main(String[] args) {
        //多态写法
        List<String> list = new ArrayList<>();
        List<String> result = addName(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static List<String> addName(List<String> list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("撒有哪啦");
        return list;
    }
}
