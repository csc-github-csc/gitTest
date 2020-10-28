package ObjectPackage;

import java.util.Objects;

/***
 * Objects中的equals方法  注意不是Object
 */
public class Demo2 {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "abc";
      //  System.out.println(str1.equals(str2));//NullPointerException
        /*null是不能调用方法的，否则会抛出空指针异常*/
        /***
         * Objects中的equals方法：
         * 对两个对象进行比较，但是这个方法可以防止空指针异常，源码：
         *return (a == b) || (a != null && a.equals(b));
         */
        System.out.println(Objects.equals(str1,str2));//flase

    }
}
