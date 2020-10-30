package Set;

import java.util.HashSet;

/**
 * Set不允许存储重复元素的原理
 */
public class Demo3 {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        String str1 = new String("abc");
        String str2 = new String("abc");
        strings.add(str1);
        strings.add(str2);
        strings.add("重地");
        strings.add("通话");
        strings.add("abc");
        System.out.println(strings);//[重地, 通话, abc]
    }
}
