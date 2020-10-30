package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo5LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("a");hs.add("www");hs.add("c");hs.add("a");
        System.out.println(hs);//[a, c, www]，打印的不是地址，说明重写了toString方法
        /*HashSet 无序且不允许重复元素*/

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("a");lhs.add("www");lhs.add("c");lhs.add("a");
        System.out.println(lhs);//[a, www, c] 重写toString方法
        /*LinkedHashSet  有序且也不允许重复元素*/

    }
}
